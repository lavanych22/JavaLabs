package chemicalstore;

public abstract class Good {
    
    private String name;
    private String manufacturer;
    private double price;
    private int capacity;
    private String colour;

    
    public Good(String name, String manufacturer, double price, int capacity, String colour) {
    	this.name = name;
		this.manufacturer = manufacturer;
		this.price = price;
		this.capacity = capacity;
		this.colour = colour;
	}

	public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public abstract GoodType getGoodType();
    public abstract GoodColour getGoodColour();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
}