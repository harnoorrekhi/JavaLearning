package loops;

public class DoWhileLoopExample {

	public static void main(String[] args) {
		// Print numbers 1 to 5
		int i = 1;
		do {
		    System.out.println(i);
		    i++;
		} while (i <= 5);

		// Print even numbers from 2 to 10
		int j = 2;
		do {
		    System.out.println(j);
		    j += 2;
		} while (j <= 10);

		// Count down from 3 to 1
		int k = 3;
		do {
		    System.out.println(k);
		    k--;
		} while (k > 0);

		// Print each letter of a String using a do-while loop
		String word = "HELLO";
		int m = 0;

		do {
		    System.out.println(word.substring(m, m + 1));
		    m++;
		} while (m < word.length());



	}

}
