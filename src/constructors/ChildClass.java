package constructors;

public class ChildClass extends ConstEx {
	
	 public ChildClass(String abc,int age) {
	 	super(abc,23);
	 	System.out.println("Child constructor: " + abc + ", age: " + age);
	}

	public ChildClass(String abc) {
	    super("default from child");
	  System.out.println("I am in ConstEx Constructor"+ abc);
	}

	
	public static void main(String[] args) {
		ChildClass cs = new ChildClass("Hello"+ 25);
		ChildClass cs1 = new ChildClass("test");
		
	}

}
