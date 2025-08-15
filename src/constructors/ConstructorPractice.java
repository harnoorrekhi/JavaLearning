package constructors;

public class ConstructorPractice {

	String message;
	String name;
	int length, width;
	int total;
	String brand;

	// Example 1: Fixed value
	public ConstructorPractice() {
		message = "Hello World";
	}

	// Example 2: One parameter
	public ConstructorPractice(String n) {
		name = n;
	}

	// Example 3: Two parameters
	public ConstructorPractice(int l, int w) {
		length = l;
		width = w;
	}

	// Example 4: Calculation
	public ConstructorPractice(int a, int b, boolean calc) {
		total = a + b;
	}

	public static void main(String[] args) {

		// Example 1
		ConstructorPractice obj1 = new ConstructorPractice();
		System.out.println(obj1.message);

		// Example 2
		ConstructorPractice obj2 = new ConstructorPractice("John");
		System.out.println(obj2.name);

		// Example 3
		ConstructorPractice obj3 = new ConstructorPractice(5, 3);
		System.out.println(obj3.length * obj3.width);

		// Example 4
		ConstructorPractice obj4 = new ConstructorPractice(4, 6, true);
		System.out.println(obj4.total);

	}
}
