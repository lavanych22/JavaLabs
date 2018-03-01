package chemicalstore;

public final class InsectRepellents extends Good {
    
    private final GoodType GoodsType = GoodType.INSECT_REPELLENTS;
    private final GoodColour GoodsColour = GoodColour.WHITE;
    private double killZoneRadius;
    private double volume;




    public InsectRepellents(String name, String manufacturer, double price, int capacity, String colour) {
		super(name, manufacturer, price, capacity, colour);
	
	}

	@Override
    public String toString() {
        return "Name = " + getName() + " Type = " + GoodsType + " Colour = " + GoodsColour +  " capacity = " + getCapacity() + " Price = " + getPrice();
    }

    public double getKillZoneRadius() {
        return killZoneRadius;
    }

    public void setKillZoneRadius(double killZoneRadius) {
        this.killZoneRadius = killZoneRadius;
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