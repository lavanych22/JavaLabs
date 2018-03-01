package chemicalstore;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public final class ChemicalSupplyStore {

	static int generalgoodsCapacity = 6;
	private String storeName;
	private String address;
	private int goodsCapacity;
	private String workingHours;
	private List<Good> goodsList = new LinkedList<>();

	public ChemicalSupplyStore() {
	}

	public ChemicalSupplyStore(String storeName, String address, int goodsCapacity, String workingHours,
			List<Good> goodsList) {
		setStoreName(storeName);
		setAddress(address);
		setgoodsCapacity(goodsCapacity);
		setWorkingHours(workingHours);
		setGoodsList(goodsList);
	}

	public void sortByPrice(List<Good> result) {
		result.sort(Comparator.comparing(Good::getPrice));
	}

	public List<Good> findByGroup(GoodType goodsType, GoodColour goodsColour) {
		List<Good> result = new LinkedList<>();

		goodsList.stream().filter(
				(goodsList) -> ((goodsList.getGoodType() == goodsType) || (goodsList.getGoodColour() == goodsColour)))
				.forEachOrdered((goodsList) -> {
					result.add(goodsList);
				});

		return result;
	}

	public String getStoreName(){
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getgoodsCapacity() {
		return goodsCapacity;
	}

	public void setgoodsCapacity(int goodsCapacity) {
		this.goodsCapacity = goodsCapacity;
	}

	public String getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(String workingHours) {
		this.workingHours = workingHours;
	}

	public List<Good> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(List<Good> goodsList) {
		this.goodsList = goodsList;
	}

	public void addGood(Good goods) {
		this.goodsList.add(goods);
	}
}
