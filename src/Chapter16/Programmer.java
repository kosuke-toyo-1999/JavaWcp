package Chapter16;

public class Programmer extends Human{
	@Override
	public void work() {
		
		// 同じ処理
		System.out.println("プログラムを書きます");
		study();
		// Programmerクラスの場合、studyメソッドを呼ぶ
	}
	
	public static void study() {
		// 同じ処理
		System.out.println("技術書を読みます");
		// Programmerクラスの場合、studyメソッドを呼ぶ
	}

}
