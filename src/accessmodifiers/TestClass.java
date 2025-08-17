package accessmodifiers;

import accessmodifiersconstructors.Dog;

public class TestClass extends Dog {

	public static void main(String[] args) {
		// ClassA cls = new ClassA();
		// System.out.println(cls.age);
		// System.out.println(cls.num);
		// cls.jump();

		ChildClass cls = new ChildClass();
		System.out.println(cls.age);
		System.out.println(cls.num);
		cls.jump();

		// constructors
		TestClass ani = new TestClass();
		// System.out.println(ani.flower); // Private cannot access
		 System.out.println(ani.name); // public can access
		// System.out.println(ani.age); // default cannot access
		 System.out.println(ani.num); // protected can access

	}
}
