package goods.cleaners;

import goods.Goods;
import goods.GoodsColour;
import goods.GoodsType;

public final class Cleaners extends Goods {

    private final GoodsType goodsType = GoodsType.CLEANERS;
    private final GoodsColour goodsColour = GoodsColour.WHITE;

    public Cleaners(final String name, final double price, final int amount) {
        setName(name);
        setPrice(price);
        setAmount(amount);
    }

    @Override
    public String toString() {
        return "Name = " + getName() + " Type = " + getGoodsType() + " Colour = " + getGoodsColour() + " Amount = "
                + getAmount() + " Price = " + getPrice();
    }

    @Override
    public GoodsType getGoodsType() {
        return goodsType;
    }

    @Override
    public GoodsColour getGoodsColour() {
        return goodsColour;
    }
}
