package practice;

public class Chapter18_2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();

		// 1から100までの値StringBufferに格納する

		for (int i = 1; i <= 100; i++) {
			

			sb.append(i).append(",");
		}
		// 最後のカンマを除去
		sb.deleteCharAt(sb.length() - 1);

		// カンマ区切りの文字列を出力
		String data = new String(sb);
		System.out.println(data);

		// 文字列をカンマで分割する
		String[] dataArray = data.split(",");
		for (String d : dataArray) {
			System.out.println(d);
		}
		
			
		}
}
