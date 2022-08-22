package Chapter18;

public class Chapter18 {

	public static void main(String[] args) {

//		String s = "Java" + "勉強中";
//		System.out.println(s);
//		
//		String y = new StringBuilder().append("Java").append("勉強中").toString();
//		
//		System.out.println(y);

//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < 10; i++) {
//			sb.append("java");
//
//		}
//		String x = sb.toString();
//		System.out.println(x);
//
//		String a = "";
//		for (int i = 0; i < 10; i++) {
//			a += "Java";  → a = new StringBuilder(a).append("java").toString();
		
//		String[] strings = { "Java", "is", "cool" };
//		String message = String.join(" ", strings);
//		System.out.println(message);
		
//		System.out.println("Java".matches("Java"));      // true
//		System.out.println("Java".matches("JavaJava"));  // false
//		System.out.println("Java".matches("java"));      // false 大文字小文字は区別される
//		
//		System.out.println("Java".matches("J.va")); // true
//		System.out.println("Jbva".matches("J.va")); // true
		
//		System.out.println("The".matches("Th.*"));// Thで始まる任意の文字
//		System.out.println("beautiful".matches(".*ful"));// fulで終わる任意の文字
		
//		System.out.println("Java".matches("Java+")); // true
//		System.out.println("Javaaaa".matches("Java+")); // true
//		System.out.println("Jav".matches("Java+")); // false
		
//		System.out.println("https://google.com".matches("https?.*")); // true
//		System.out.println("http://google.com".matches("https?.*")); // true
//		System.out.println("\\(Windowsでは¥)");
		
		System.out.println("明日僕は帰宅します".matches("明日(僕|私)は帰宅します")); // 僕でも私でもtrue
		System.out.println("じゃーん".matches("(じゃ)+ーん")); // じゃーん、じゃじゃーん、じゃじゃじゃーん等にマッチする
		int hour = 1;
		int minute = 1;
		int second = 1;
		int milliSecond = 1;
		
		String message = String.format("現在の時刻は%d時%d分%d秒%dです", hour, minute, second, milliSecond);
		System.out.println(message);
		
//		public static String format(String format, Object... args) {
//		}
		
		
		}


	

}
