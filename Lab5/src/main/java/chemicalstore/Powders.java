package chemicalstore;

public final class Powders extends Good {
    
    private final GoodType GoodsType = GoodType.POWDERS;
    private final GoodColour GoodsColour = GoodColour.BLACK;
    private String material;
    private double weight;
    private String colour;


 

    public Powders(String name, String manufacturer, double price, int capacity, String colour) {
		super(name, manufacturer, price, capacity, colour);
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
        return "Name = " + getName() + " Type = " + GoodsType + " Colour = " + GoodsColour + " Capacity = " + getCapacity() + " Price = " + getPrice();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
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