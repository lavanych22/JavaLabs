package chemicalstore;

public final class Liquids extends Good {
    
    private final GoodType GoodsType = GoodType.LIQUIDS;
    private final GoodColour GoodsColour = GoodColour.BLUE;
    private double volume;
    private String colour;
    private double density;




    public Liquids(String name, String manufacturer, double price, int capacity, String colour) {
		super(name, manufacturer, price, capacity, colour);
		
	}

	@Override
    public String toString() {
        return "Name = " + getName() + " Type = " + GoodsType + " Colour = " + GoodsColour + " Capacity = " + getCapacity() + " Price = " + getPrice();
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
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