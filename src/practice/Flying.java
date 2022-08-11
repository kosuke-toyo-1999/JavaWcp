package practice;

public interface Flying {

	// メソッド（抽象メソッド）
	void fly();

	// defaultメソッド
	default void powerOff() {
		System.out.println("飛んでいる場合は落下します。");
	}
}
FlyingPhone.java
package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
	// プログラムを作成
}