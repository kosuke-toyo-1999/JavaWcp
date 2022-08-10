
public class Chapter08_2 {
	public static void main(String[] args) {
		String day = "monday";

		switch (day) {

		case "sunday":
			System.out.println("日曜日");

			break;
			
		case "monday":
			System.out.println("月曜日");

			break;
			
		case "tuesday":
			System.out.println("火曜日");

			break;
			
		case "wednesday":
			System.out.println("水曜日");

			break;
			
		case "thursday":
			System.out.println("木曜日");

			break;
			
		case "friday":
			System.out.println("金曜日");

			break;
			
		case "saturday":
			System.out.println("土曜日");

			break;
			
		default:
			System.out.println("曜日ではありません");
		}
	}
}
