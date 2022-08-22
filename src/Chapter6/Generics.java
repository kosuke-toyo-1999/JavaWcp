package Chapter6;

import java.util.ArrayList;
import java.util.List;

public class Generics {
	static List<String> items = new ArrayList<String>();
	
	public static void main(String args[]) {
	
	items.add("bag"); // OK

	// これ以下はString型ではない要素を追加しているのでコンパイルエラー
	//items.add(0);
	//items.add(true);
	
	String item = items.get(0); // OK

	// これ以下はString型ではない変数に代入しているのでコンパイルエラー
	//int item = items.get(0);
	//boolean item = items.get(0);
	

	}

}
