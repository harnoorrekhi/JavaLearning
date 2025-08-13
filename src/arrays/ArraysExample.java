package arrays;

public class ArraysExample {

	public static void main(String[] args) {
		int[] age = {12,20,55,68,92};
		
		String[] name = new String[5];
		
		String [] words = {"Hello", "World", "Global","Canada"};
		
        System.out.println(words[0]);
        
        words[2] = "Flower";
        
        System.out.println(words[2]);
        System.out.println("============");
        
        String [] Words = {"Hello", "World", "Global","Canada"};
     //   System.out.println(age[5]);
        
      //  System.out.println(words);
        
        for(int i = 0; i<3; i++) {
        	System.out.println(Words[i]);
        }
        System.out.println("============");
        //for-each loop
        for(String mydata : Words) {
        	System.out.println(mydata);
        }
	}

}
