
public class Main {

	public static void main(String[] args) {
		Helicopter MI_1 = new Helicopter();
		Helicopter KT_112 = new Helicopter("UA", "KT-112", 250.0, 2000.2);
		Helicopter Skyline_800 = new Helicopter("USA", "Skyline-800", 315.3, 3200.6, 1325.5);
		
		MI_1.setModel("MI-1");
		MI_1.setWeight(155.3);
		MI_1.setSpeed(2420.5);
		
		System.out.println(MI_1.toString());
		System.out.println(KT_112.toString());
		System.out.println(Skyline_800.toString());
		
		Helicopter.printStaticSum();
		
		MI_1.printSum();
		KT_112.printSum();
		Skyline_800.printSum();
		
		MI_1.resetValue("USSR", "MI-1", 159.9, 1500.2, 1100.2);
		KT_112.resetValue("UA", "KT-112", 250.0, 2000.2, 1300.5);
		Skyline_800.resetValue("USA", "Skyline-800", 315.3, 3200.6, 1325.5);
				
		System.out.println(MI_1.toString());
		System.out.println(KT_112.toString());
		System.out.println(Skyline_800.toString());
		
		Helicopter.printStaticSum();
		
		MI_1.printSum();
		KT_112.printSum();
		Skyline_800.printSum();
	}

}
