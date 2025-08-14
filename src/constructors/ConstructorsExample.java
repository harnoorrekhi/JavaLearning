package constructors;

public class ConstructorsExample {

	String name;
	int value;
	
	public ConstructorsExample() {
		name = "Taiwan";
	}
	
	public ConstructorsExample(String value) {
		value = name;
		
	}
	public ConstructorsExample(int num) {
		value = num; 
	}
	public static void main(String[] flower) {
		
		ConstructorsExample cs = new ConstructorsExample();
		System.out.println(cs.name);
		
		ConstructorsExample cs1 = new ConstructorsExample("India");
		System.out.println(cs1.name);
		
		ConstructorsExample cs2 = new ConstructorsExample(20);
		System.out.println(cs2.value);
	}
	
		
}
