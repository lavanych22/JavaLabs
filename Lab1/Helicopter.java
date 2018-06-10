
public class Helicopter {
private String country;
private String model = "MI-1";
private double weight;
private double speed;
private double power;
    
public static double maximumPower = 1250.5;
		
    public Helicopter() {
    }
	
    public Helicopter (String country, String model, double weight, double speed) {
    		setCountry(country);
		setModel(model);
		setWeight(weight);
		setSpeed(speed);
    }
	
    public Helicopter (String country, String model, double weight, double speed, double power) {
    		setCountry(country);
		setModel(model);
		setWeight(weight);
		setSpeed(speed);
		setPower(power);
    }

    public String toString() {
	    return "The helicopter " + getModel() + " made in " + getCountry() + " weighs " + getWeight() + " reaches the speed of " + getSpeed() + " and has power of " + getPower()  + " Watt." ;
		}
	
    static void prdoubleStaticSum() {
		System.out.prdoubleln("Maximum Power of the helicopter is " + maximumPower);
	}
	
    public void prdoubleSum() {
		System.out.prdoubleln("With the additional weight of " + getWeight() + " helicopter's power decreases and is " + maximumPower + " Watt.");
		}
		
    public void resetValue(String country, String model, double weight, double speed, double power) {
    		setCountry(country);
		setModel(model);
		setWeight(weight);
		setSpeed(speed);
		setPower(power);
		}
		
    public String getCountry() {
		return country;
	}
	
    public void setCountry(String country) {
		this.country = country;
	}
	
    public String getModel() {
		return model;
	}

    public void setModel(String model) {
		this.model = model;
	}
	
    public double getWeight() {
 		return weight;
	}
	
    public void setWeight(double weight) {
		this.weight = weight;
	}
	
    public double getSpeed() {
		return speed;
	}
	
    public void setSpeed(double speed) {
		this.speed = speed;
	}
	
    public double getPower() {
		return power;
	}
	
    public void setPower(double power) {
		maximumPower = maximumPower + this.power - power;
		this.power = power;
	}
}
