package chemicalsupplystore.goods;

public class Goods {

    private String name;
    private double price;
    private int amount;

    public Goods(final String name, final double price, final int amount, final ) {
        setName(name);
        setPrice(price);
        setAmount(amount);
    }

    protected Goods() {
    }

    public String getHeaders() {
        return "Name" + "," + "Price" + "," + "Amount" + "," + "Type" + "," + "Colour";
    }

    public String toCVS() {
        return getName() + "," + getPrice() + "," + getAmount() + "," + getGoodsType() + "," + getGoodsColour();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(final int amount) {
        this.amount = amount;
    }

}
