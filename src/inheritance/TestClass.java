package inheritance;

public class TestClass {

	public static void main(String[] args) {
		Dog dg = new Dog();
		dg.bark();
		dg.jump();
		
		Animal ani = new Animal();
		ani.hunt();
		// ani.bark();   // Compile time error- not possible
		
		
		Labrador lab = new Labrador();
		lab.drinkwater();
		lab.bark();
		lab.hunt();
		lab.sleep();
		
	}

}
