package controlstatement;

public class DaysOfTheWeek {
	String today ="Thursday";

	public static void main(String[] args) {
		DaysOfTheWeek dw = new DaysOfTheWeek();
		
		if(dw.today=="Sunday") {
			System.out.println("Today is Sunday");
		}
		if(dw.today=="Monday") {
			System.out.println("Today is Monday");
		}
		if(dw.today=="Tuesday") {
			System.out.println("Today is Tuesday");
		}
		if(dw.today=="Wednesday") {
			System.out.println("Today is Wednesday");
		}
		if(dw.today=="Thursday") {
			System.out.println("Today is Thursday");
		}
		if(dw.today=="Friday") {
			System.out.println("Today is Friday");
		}
		if(dw.today=="Saturday") {
			System.out.println("Today is Saturday");
		}
	}
}
