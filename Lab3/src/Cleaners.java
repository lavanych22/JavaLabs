public final class Cleaners extends Good {
    
    private final GoodType GoodsType = GoodType.CLEANERS;
    private final GoodColour GoodsColour = GoodColour.WHITE;
    


    public Cleaners(String name, String manufacturer, double price, int capacity, String colour) {
		super(name, manufacturer, price, capacity, colour);
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
        return "Name = " + getName() + " Type = " + GoodsType + " Colour = " + GoodsColour + " Capacity = " + getCapacity() + " Price = " + getPrice();
    }
    
    @Override
     public GoodType getGoodType() {
        return GoodsType;
    }
    
    @Override
    public GoodColour getGoodColour() {
        return GoodsColour;
    }
}