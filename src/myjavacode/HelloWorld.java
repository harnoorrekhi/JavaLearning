package myjavacode;

public class HelloWorld {

	int age = 23;

	public void eat() {
		System.out.println("ABC");
		System.out.println("Toronto");
	}

	// main method

	public static void main(String[] args) {
		System.out.println("Hello World!!");
		System.out.println("Harnoor");
		System.out.println("Flower");

		// object
		HelloWorld hwobj = new HelloWorld();
		hwobj.eat();
		// obj=hw
		jump();
	}

	public static void jump() {
		System.out.println("Vancouver");
		System.out.println("Calgary");
	}

}
