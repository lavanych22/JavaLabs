import goods.Goods;
import goods.GoodsColour;
import goods.GoodsType;
import goods.airfresheners.AirFresheners;
import goods.cleaners.Cleaners;
import goods.insectrepellents.InsectRepellents;
import goods.laundrydetergents.LaundryDetergents;
import goods.liquids.Liquids;
import goods.powders.Powders;
import goods.scouringpads.ScouringPads;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.runner.RunWith;

import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@RunWith(JUnitPlatform.class)
@IncludeEngines("junit-jupiter")
public class ChemicalSupplyStoreTest {
    private ChemicalSupplyStore koshyk = new ChemicalSupplyStore("koshyk", "Lviv", 10, "from 9 to 21");;;

    @BeforeEach
    void init() {
        koshyk.addGoods(new AirFresheners("Air Fresh Matic", 4.2, 5, "Fu", 10.0));
        koshyk.addGoods(new AirFresheners("Persik", 3.2, 15, "Otpad", 11.0));
        koshyk.addGoods(new AirFresheners("Yabko", 4.0, 10, "Nyam-nyam", 12.0));
        koshyk.addGoods(new Cleaners("Kitchen", 5.2, 3));
        koshyk.addGoods(new Cleaners("Floor", 2.2, 7));
        koshyk.addGoods(new Cleaners("Bathroom", 7.2, 6));
        koshyk.addGoods(new Cleaners("Polirol'", 4.3, 9));
        koshyk.addGoods(new LaundryDetergents("Fairy", 5.3, 3, 5.0, 10.0));
        koshyk.addGoods(new Liquids("Fairy", 5.3, 3, 5.0, "White", 10.0));
        koshyk.addGoods(new Liquids("Perwoll", 8.3, 7, 4.0, "Pink", 11.0));
        koshyk.addGoods(new Liquids("Persil", 10.3, 7, 7.0, "Black", 21.0));
        koshyk.addGoods(new InsectRepellents("Anti-comar", 4.0, 0, 8.3, 4.0));
        koshyk.addGoods(new InsectRepellents("Anti-bee", 11.0, 2, 3.3, 4.5));
        koshyk.addGoods(new InsectRepellents("Anti-fly", 10.0, 4, 3.7, 8.5));
        koshyk.addGoods(new Powders("Calgon", 5.6, 2, "Sodium triphosphate", 10.0, "Multi-coloured"));
        koshyk.addGoods(new Powders("Tide", 3.6, 4, "Polyphosphoric acid", 10.9, "White"));
        koshyk.addGoods(new ScouringPads("Kuhovarochka", 6.6, 3, 3.6, "Green"));
        koshyk.addGoods(new ScouringPads("Gospodarochka", 7.6, 4, 4.6, "Yellow"));
    }


    @Test
    public void testGetterGoodsWithValidStoreName() throws NoSuchFieldException, IllegalAccessException {
        koshyk.setStoreName("Epicenter");
        final String result = koshyk.getStoreName();
        assertEquals("Epicenter", result, "Fields don't match");
    }

    @Test
    public void testSetterGoodsWithValidStoreName() throws NoSuchFieldException, IllegalAccessException {
        String storeName = "Intermarket";
        koshyk.setStoreName(storeName);
        assertEquals("Intermarket", field.get(koshyk), "Fields don't match");
    }

    @Test
    public void testGetterGoodsWithValidAddress() throws NoSuchFieldException, IllegalAccessException {
        field.set(koshyk, "Lviv");
        final String result = koshyk.getAddress();
        assertEquals("Lviv", result, "Fields don't match");
    }

    @Test
    public void testSetterGoodsWithValidAddress() throws NoSuchFieldException, IllegalAccessException {
        String address = "Lviv";
        koshyk.setAddress(address);
        assertEquals("Lviv", field.get(koshyk), "Fields don't match");
    }

    @Test
    public void testGetterGoodsWithValidGoodsAmount() throws NoSuchFieldException, IllegalAccessException {
        koshyk.setGoodsAmount(5);
        final int result = koshyk.getGoodsAmount();
        assertEquals(5, result, "Fields don't match");
    }

    @Test
    public void testSetterGoodsWithValidGoodsAmount() throws NoSuchFieldException, IllegalAccessException {
        int goodsAmount = 5;
        koshyk.setGoodsAmount(goodsAmount);
        final Field field = koshyk.getClass().getDeclaredField("goodsAmount");
        field.setAccessible(true);
        assertEquals(5, field.get(koshyk), "Fields don't match");
    }

    @Test
    public void testGetterGoodsWithValidWorkingHours() throws NoSuchFieldException, IllegalAccessException {
        final Field field = koshyk.getClass().getDeclaredField("workingHours");
        field.setAccessible(true);
        field.set(koshyk, "9-15");
        final String result = koshyk.getWorkingHours();
        assertEquals("9-15", result, "Fields don't match");
    }

    @Test
    public void testSetterGoodsWithValidWorkingHours() throws NoSuchFieldException, IllegalAccessException {
        String workingHours = "9-15";
        koshyk.setWorkingHours(workingHours);
        final Field field = koshyk.getClass().getDeclaredField("workingHours");
        field.setAccessible(true);
        assertEquals("9-15", field.get(koshyk), "Fields don't match");
    }

    @Test
    public void testAddGoods() {
        ChemicalSupplyStore chemicalSupplyStore = new ChemicalSupplyStore("Epicenter", "Lviv", 5, "from 9 to 15");
        List<Goods> goodsList = new LinkedList<>();
        assertTrue(goodsList.isEmpty());
        chemicalSupplyStore.addGoods(new AirFresheners("Airic", 10.5, 5, "Nice", 0.5));
    }

    @Test
    public final void testGeneralToString() {
        assertFalse(koshyk.toString().contains("@"));
    }

    @Test
    public void testFindByType() {
        ChemicalSupplyStore kuh = new ChemicalSupplyStore("kuh", "kuiv", 5, "9-11");
        AirFresheners air1 = new AirFresheners("Airic", 5.0, 4, "Nice", 8.5);
        AirFresheners air2 = new AirFresheners("Pikka", 4.0, 5, "Good", 8.5);
        kuh.addGoods(air1);
        kuh.addGoods(air2);
        List<Goods> result1 = kuh.findByGroup(GoodsType.AIR_FRESHENERS, GoodsColour.NONE);
        assertEquals(air1, result1.get(0), "Price doesn't match");
    }

    @Test
    public void testSortByPrice() {
        ChemicalSupplyStore kuh = new ChemicalSupplyStore("fa", "lviv", 5, "9-15");
        AirFresheners air1 = new AirFresheners("Airic", 5.0, 4, "Nice", 8.5);
        AirFresheners air2 = new AirFresheners("Pikka", 4.0, 5, "Good", 8.5);
        kuh.addGoods(air1);
        kuh.addGoods(air2);
        List<Goods> result1;
        result1 = kuh.findByGroup(GoodsType.AIR_FRESHENERS, GoodsColour.BLACK);
        List<Goods> result2 = kuh.findByGroup(GoodsType.AIR_FRESHENERS,GoodsColour.BLACK);
        kuh.sortByPrice(result2);
        assertEquals(result1.get(0), result2.get(1), "Price doesn't match");
    }


    @AfterEach
    void tearDown() {
        koshyk = null;
    }
}
