package loops;

public class WhileLoopExample {

	public static void main(String[] args) {
		// Print numbers 1 to 5
		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}

		// Print even numbers from 2 to 10
		int j = 2;
		while (j <= 10) {
			System.out.println(j);
			j += 2;
		}

		// Count down from 5 to 1
		int k = 5;
		while (k > 0) {
			System.out.println(k);
			k--;
		}

		// Sum numbers until sum is at least 10
		int sum = 0, num = 1;
		while (sum < 10) {
			sum += num;
			num++;
		}
		System.out.println("Sum reached: " + sum);

	}

}
