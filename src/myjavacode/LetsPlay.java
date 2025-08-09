package myjavacode;

public class LetsPlay {
	
	public static void main(String[] args) {
		
	}

	// Non static
	public void jump() {
	System.out.println("lets jump");
	Animal mal = new Animal();
	mal.cage();
	
	}
	
	// Non static
	public void eat() {
		System.out.println("lets eat");
		Animal an = new Animal();
		an.hunt();
	}
	
	// Static
	public static void sleep() {
		System.out.println("lets sleep");
		LetsPlay lp = new LetsPlay();
		lp.eat();
				
	}
	
	// Static
	public static void walk() {
		System.out.println("lets walk");
		Animal.hunt();
		
		Animal abc = new Animal();
		abc.cage();
	}
	
	
}
