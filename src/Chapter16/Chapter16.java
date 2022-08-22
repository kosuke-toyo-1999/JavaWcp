package Chapter16;

public class Chapter16 {
	public static void main(String[] args) {
		// 5つのサブクラスのインスタンスを生成
		Human[] h = new Human[] { new Student(), new Programmer(), new Driver(), new Teacher(), new Doctor(), };

		// 寝ると体力が回復する
		for (Human hm : h) {
			hm.work();
		}
	}

}