package variables;

public class DifferentVariables {

	// local variable
	// instance variable (object variable)
	// static variable(class variable)

	String lady = "Amy"; // instance variable
	static int age = 26; // static variable

	public void test() {
		String name = "Harnoor"; // local variable
		System.out.println(name);
	}

	public void run() {
		System.out.println(lady);
		int myage = DifferentVariables.age;
		System.out.println(age);
	}

	public static void jump() {
		DifferentVariables dv = new DifferentVariables();
		System.out.println(dv.lady);
	}
}
