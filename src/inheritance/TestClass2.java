package inheritance;

public class TestClass2 {

	public static void main(String[] args) {
		Dog dg = new Dog();
		Animal ani = new Animal();
		
		Animal anidog = new Dog();
		anidog.hunt();
		anidog.drinkwater();
		anidog.jump();
		//anidog.bark();
		
		anidog.drinkwater();
		

	}

}
