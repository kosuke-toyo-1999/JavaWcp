package Chapter6;

import java.util.ArrayList;
import java.util.List;

public class Generics1 {
	
	public static void main(String args[]) {
	
	List<Object> items = new ArrayList<Object>();
	
	// 以下、いずれもOK
	items.add("bag");
	items.add(0);
	items.add(true);
	
	String item1 = (String)items.get(0);
	
	String item2 = (String)items.get(1); // Integer型の要素をString型にキャストしようとして実行時エラー
	
	List<String> items3 = new ArrayList<>();
	
	
	}

}
