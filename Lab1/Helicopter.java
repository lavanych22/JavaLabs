
public class Helicopter {
private String Country;
private String Model = "MI-1";
private double Weight;
private double Speed;
private double Power;
    
	public static double MaximumPower = 1250.5;
		
    public Helicopter() {
    }
	
    public Helicopter (String Country, String Model, double Weight, double Speed) {
    	setCountry(Country);
		setModel(Model);
		setWeight(Weight);
		setSpeed(Speed);
    }
	
    public Helicopter (String Country, String Model, double Weight, double Speed, double Power) {
    	setCountry(Country);
		setModel(Model);
		setWeight(Weight);
		setSpeed(Speed);
		setPower(Power);
    }
	
	public String toString() {
	    return "The helicopter " + getModel() + " made in " + getCountry() + " weighs " + getWeight() + " reaches the speed of " + getSpeed() + " and has power of " + getPower()  + " Watt." ;
		}
	
    static void prdoubleStaticSum() {
		System.out.prdoubleln("Maximum Power of the helicopter is " + MaximumPower);
	}
	
    public void prdoubleSum() {
		System.out.prdoubleln("With the additional weight of " + getWeight() + " helicopter's power decreases and is " + MaximumPower + " Watt.");
		}
		
    public void resetValue(String Country, String Model, double Weight, double Speed, double Power) {
    	setCountry(Country);
		setModel(Model);
		setWeight(Weight);
		setSpeed(Speed);
		setPower(Power);
		}
		
	public String getCountry() {
		return Country;
	}
	
    public void setCountry(String Country) {
		this.Country = Country;
	}
	
	public String getModel() {
		return Model;
	}

    public void setModel(String Model) {
		this.Model = Model;
	}
	
    public double getWeight() {
 		return Weight;
	}
	
    public void setWeight(double Weight) {
		this.Weight = Weight;
	}
	
	public double getSpeed() {
		return Speed;
	}
	
    public void setSpeed(double Speed) {
		this.Speed = Speed;
	}
	
    public double getPower() {
		return Power;
	}
	
    public void setPower(double Power) {
		MaximumPower = MaximumPower + this.Power - Power;
		this.Power = Power;
	}
}
