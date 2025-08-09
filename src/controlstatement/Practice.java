package controlstatement;

public class Practice {

	public static void main(String[] args) {

		String today = "WeDnesDay";
		switch (today) {

		case "Sunday": {
			System.out.println("today is Sunday");
			break;
		}
		case "Monday": {
			System.out.println("today is Monday");
			break;
		}
		case "Wednesday": {
			System.out.println("today is Wednesday");
			break;
		}
		default: {
			System.out.println("you are an alien");
		}
		}
		String flower = "ROSE";
		switch (flower.toLowerCase()) {

		case "lily": {
			System.out.println("I am lily");
			break;
		}
		case "sunflower": {
			System.out.println("I am sunflower");
			break;
		}
		case "marigold": {
			System.out.println("I am marigold");
			break;
		}
		case "rose": {
			System.out.println("I am rose");
			break;
		}
		}
		String TreeLife = "PINETREE";
		String Tree = TreeLife.toLowerCase();
		switch (Tree) {

		case "MapleTree": {
			System.out.println("I am MapleTree");
			break;
		}
		case "MangoTree": {
			System.out.println("I am MangoTree");
			break;
		}
		case "AppleTree": {
			System.out.println("I am AppleTree");
			break;
		}
		case "pinetree": {
			System.out.println("I am pinetree");
			break;
		}
		}
	}
}
