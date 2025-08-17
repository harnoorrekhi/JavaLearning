package accessmodifiersconstructors;

public class Cat extends Dog {

	public static void main(String[] args) {
		Dog ani = new Dog();
		// System.out.println(ani.flower); // Private cannot access
		System.out.println(ani.name); 
		System.out.println(ani.age); 
		System.out.println(ani.num); 

	}
}
