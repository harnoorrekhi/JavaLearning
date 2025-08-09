package controlstatement;

public class SwitchCaseExample {
	
	public static void main(String[] args) {
		
		String today ="Thursday";
		switch (today) {
		
		case "Sunday":{
			System.out.println("Today is Sunday");
			break;
		}
		case "Monday":{
			System.out.println("Today is Monday");
			break;
		}
		case "Tuesday":{
			System.out.println("Today is Tuesday");
			break;
		}
		case "Wednesday":{
			System.out.println("Today is Wednesday");
			break;
		}
		case "Thursday":{
			System.out.println("Today is Thursday");
			break;
		}
		case "Friday":{
			System.out.println("Today is Friday");
			break;
		}
		case "Satuday":{
			System.out.println("Today is Saturday");
			break;
		}
		default:{
			System.out.println("You dont live in this world");
		}
		}
		
	
	}
	
}


