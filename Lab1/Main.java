
public class Main {
	public static void main(String[] args) {
		Helicopter mI1 = new Helicopter();
		Helicopter kT112 = new Helicopter("UA", "KT-112", 250.0, 2000.2);
		Helicopter skyline800 = new Helicopter("USA", "Skyline-800", 315.3, 3200.6, 1325.5);
		
		mI1.setModel("MI-1");
		mI1.setWeight(155.3);
		mI1.setSpeed(2420.5);
		
		System.out.println(mI1.toString());
		System.out.println(kT112.toString());
		System.out.println(skyline800.toString());
		
		Helicopter.printStaticSum();
		
		mI1.printSum();
		kT112.printSum();
		skyline800.printSum();
		
		mI1.resetValue("USSR", "MI-1", 159.9, 1500.2, 1100.2);
		kT112.resetValue("UA", "KT-112", 250.0, 2000.2, 1300.5);
		skyline800.resetValue("USA", "Skyline-800", 315.3, 3200.6, 1325.5);
				
		System.out.println(mI1.toString());
		System.out.println(kT112.toString());
		System.out.println(skyline800.toString());
		
		Helicopter.printStaticSum();
		
		mI1.printSum();
		kT112.printSum();
		skyline800.printSum();
	}

}
