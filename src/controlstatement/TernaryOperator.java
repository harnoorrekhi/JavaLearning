package controlstatement;

public class TernaryOperator {

	public static void main(String[] args) {

		boolean canVote;
		int age = 20;
		if (age > 18) {
			canVote = true;
		} else {
			canVote = false;
		}
		 canVote = age > 18 ? true : false; // ternary operator

		String naam = "Hello";
		int num = naam == "abc" ? 2 : 5;

		String status;
		if (age >= 20) {
			status = "Adult";
		} else {
			status = "Minor";
		}
		status = (age >= 20) ? "Adult" : "Minor";
	

	boolean isLoggedIn = false;
	String message = isLoggedIn ? "Welcome back!" : "Please log in.";
	System.out.println(message);
	
	int number = 7;
	boolean iskid;
	iskid = (number ==7) ? true : false;
	System.out.println(iskid);
	
	String play;
	int digi = 3;
	play = (number ==3)? "its a baby" :"its a toddler";
	System.out.println(play);
	
	String eat = "eating";
	String weight = "health";
	int ages = 12;
	String result = (ages <=12) ? eat : weight;
	System.out.println(result);
	}
}
