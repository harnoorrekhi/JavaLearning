package accessmodifiers;

public class ChildClass extends ClassA {
	
	public static void main(String[] args) {
		ChildClass cls = new ChildClass();
		System.out.println(cls.age);
		System.out.println(cls.num);
		cls.jump();
		

	}

}
