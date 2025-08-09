package datatypes;

public class DataTypeExamples {

	// Non Primitive data type
	// Class, Array
	String name = "Apple";
// Primitive data types

		byte age = 25;
		short year = 2025;
		int salary = 50000;
		long dist = 10000000;
		float pi = 3.14f;
		double rate = 19.99;
		boolean israining = false;
		
		
		public static void main(String[] args) {
			DataTypeExamples dve = new DataTypeExamples();
			System.out.println(dve.salary);
			System.out.println(dve.year);
			System.out.println(new DataTypeExamples().age);
			System.out.println(12.5 + 10.2);
			System.out.println(12.5f + 18.2);
			System.out.println(new DataTypeExamples().israining);
		}

}
