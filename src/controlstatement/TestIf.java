package controlstatement;

public class TestIf {

	public static void testLogic() {

		boolean iwalk = false;

		int num1 = 20;
		int num2 = 5;
		String name = "Flower";

		if (num1 > num2) {
			System.out.println("num1 is greater than num2");
		}

		if (iwalk) {
			System.out.println("I shall stay healthy");
		} 
		if(iwalk==false) {
			System.out.println("I shall not stay healthy");
		}
		else if(name=="plant"){
			System.out.println("I am a plant");
		}
	}

}

	

