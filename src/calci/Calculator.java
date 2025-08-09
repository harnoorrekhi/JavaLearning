package calci;

public class Calculator {

	public void add(int num1, int num2) {
		int total = num1 + num2;
		System.out.println(total);
		
	}
	public void add(float num1, float num2) {
		float total = num1 + num2;
		System.out.println(total);
		
	}
	
	
	public void substract(int num1, int num2) {
		int total = num1 - num2;
		System.out.println(total);
	}
	
	public void multiply(int num1, int num2) {
		int total = num1 * num2;
		System.out.println(total);
	}
		
		public void multiply(double num1, double num2, double num3) {
			double total = num1 * num2 * num3;
		System.out.println(total); 
		
		}
	
	public void divide(int num1, int num2) {
		int total = num1 / num2;
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(50,60);
		cal.substract(100, 20);
		cal.multiply(45,10);
		cal.divide(50,10);
		

	}
	
	
}


