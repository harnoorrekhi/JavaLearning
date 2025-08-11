package loops;

public class ForLoopExamples {

	public static void main(String[] args) {
		//  Print numbers 1 to 5
		for (int i = 1; i <= 5; i++) {
		    System.out.println(i);
		}

		//  Print even numbers from 2 to 10
		for (int i = 2; i <= 10; i += 2) {
		    System.out.println(i);
		}

		//  Sum of first 5 natural numbers
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
		    sum += i;
		}
		System.out.println("Sum: " + sum);

		// Print each letter of a String individually 
		String word = "ABCDE";
		for (int i = 0; i < word.length(); i++) {
		    System.out.println(word.substring(i, i + 1));
		}



	}

}
