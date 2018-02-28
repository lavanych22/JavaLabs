public final class ScouringPads extends Good {
    
    private final GoodType GoodsType = GoodType.SCOURING_PADS;
    private final GoodColour GoodsColour = GoodColour.YELLOW;
    private double rigidity;
    private String colour;




    public ScouringPads(String name, String manufacturer, double price, int capacity, String colour) {
		super(name, manufacturer, price, capacity, colour);
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
        return "Name = " + getName() + " Type = " + GoodsType + " Colour = " + GoodsColour + " Capacity = " + getCapacity() + " Price = " + getPrice();
    }

    public double getRigidity() {
        return rigidity;
    }

    public void setRigidity(double rigidity) {
        this.rigidity = rigidity;
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