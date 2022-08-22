package practice;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Chapter4 {
	static // ArrayListを生成する場合
	List<String> list1 = new ArrayList<String>();

	// LinkedListを生成する場合
	List<Integer> list2 = new LinkedList<Integer>();
	
	
	public static void main(String[] args) {
	// 要素を追加する
	list1.add("りんご");
	list1.add("みかん");

	// 位置を指定して要素を追加する
	list1.add(1, "バナナ");
	String item = list1.get(0);
	System.out.println(item);
	
	list1.contains("バナナ");
	list1.contains("なし");
	list1.size();
	
	// 要素を削除する (要素が文字列の場合、文字列として同じであれば削除されます)
	list1.remove("バナナ"); // 戻り値はtrue

	list1.remove("なし"); // 何もしない、戻り値はfalse

	// 位置を指定して要素を削除する
	list1.remove(0); //戻り値は"りんご"
	//list1.remove(5); // コレクションの要素数より大きい位置を指定すると実行時エラー
	}
	

}
