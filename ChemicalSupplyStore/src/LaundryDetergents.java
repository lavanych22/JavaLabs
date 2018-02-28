public final class LaundryDetergents extends Good {
    
    private final GoodType GoodsType = GoodType.LAUNDRY_DETERGENTS;
    private final GoodColour GoodsColour = GoodColour.RED;
    private double density;
    private double volume;




    public LaundryDetergents(String name, String manufacturer, double price, int capacity, String colour) {
		super(name, manufacturer, price, capacity, colour);
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
        return "Name = " + getName() + " Type = " + GoodsType + " Colour = " + GoodsColour + " Capacity = " + getCapacity() + " Price = " + getPrice();
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
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