public final class AirFresheners extends Good {
    
    private final GoodType GoodsType = GoodType.AIR_FRESHENERS;
    private final GoodColour GoodsColour = GoodColour.WHITE;
    private String smell;
    private double volume;



    @Override
    public String toString() {
        return "Name = " + getName() + " Type = " + GoodsType + " Colour = " + GoodsColour + " capacity = " + getCapacity() + " Price = " + getPrice();
    }
    
    public AirFresheners(String name, String manufacturer, double price, int capacity, String colour) {
		super(name, manufacturer, price, capacity, colour);
		// TODO Auto-generated constructor stub
	}

	public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
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