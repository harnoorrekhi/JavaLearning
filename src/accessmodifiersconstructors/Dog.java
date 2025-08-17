package accessmodifiersconstructors;

public class Dog extends Animal {
	public Dog() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Dog ani = new Dog();
		// System.out.println(ani.flower); // Private cannot access
		System.out.println(ani.name); // public
		System.out.println(ani.age); // default
		System.out.println(ani.num); // protected

	}
}
