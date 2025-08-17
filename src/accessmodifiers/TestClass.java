package accessmodifiers;

public class TestClass {

	public static void main(String[] args) {
	//	ClassA cls = new ClassA();
	//	System.out.println(cls.age);
		// System.out.println(cls.num);
		//cls.jump();
		
		ChildClass cls = new ChildClass();
		System.out.println(cls.age);
		System.out.println(cls.num);
		cls.jump();
		
		
}
}
