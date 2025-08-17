package accessmodifiers;

public class ClassA {
	protected int age = 20;
	
	 int num = 10;

	protected  void jump() {
		System.out.println("I am jumping");
	}

	public static void main(String[] args) {
		ClassA cls = new ClassA();
		System.out.println(cls.age);
		System.out.println(cls.num);
		cls.jump();
		

	}
}

	
