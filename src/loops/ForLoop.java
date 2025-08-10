package loops;

public class ForLoop {

	public static void main(String[] args) {
		// print number for 1 to 10

		for (int i = 0; i < 10; i++) {
			System.out.println("Number is :" + i);
		}
		System.out.println("For loops Ended");
		
		// since we want to print number from 1 not 0 till 10
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Number is :" +i);
		}
			System.out.println("======");
		
		// print number for 10 to 1
		for(int i = 10; i >= 1; i--) {
			System.out.println("Number is :" +i);
		}
	}

}
