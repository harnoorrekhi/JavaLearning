package accessmodifiersconstructors;

public class Animal {
	public String name = "Lion";
	private String flower = "Rose";
	int age;
	protected int num;
	

    // This is a public constructor
    public Animal() {
        name = "Lion";
        flower = "Rose";
        age = 5;
        num = 10;
        System.out.println("Animal constructor called");
    }
	
	public static void main(String[] args) {
	Animal ani = new Animal();
	System.out.println(ani.flower); // Private 
	System.out.println(ani.name);  // public
	System.out.println(ani.age);   // default
	System.out.println(ani.num);   // protected
	
	}
}
