package arrays;

import accessmodifiers.ChildClass;

public class AnotherPackageClass extends ChildClass {

	public static void main(String[] args) {
		AnotherPackageClass cls = new AnotherPackageClass();
		System.out.println(cls.age);
		// System.out.println(cls.num);
		cls.jump();
		

	}

}
