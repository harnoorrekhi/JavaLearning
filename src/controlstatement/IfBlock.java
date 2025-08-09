package controlstatement;

public class IfBlock {

	public static void main(String[] args) {
		IfBlock ib = new IfBlock();
		ib.testlogic();
		TestIf.testLogic();

	}

	public void testlogic() {

		boolean iwalk = false;

		int num1 = 20;
		int num2 = 5;
		String name = "Flower";

		if (num1 > num2) {
			System.out.println("num1 is greater than num2");
		}

		else if (iwalk) {
			System.out.println("I shall stay healthy");
		} 
		else if(iwalk==false) {
			System.out.println("I shall not stay healthy");
		}
		else if(name=="Flower"){
			System.out.println("I am a flower");
		}
	}

}
