package practice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Chapter4Map {
	static // HashMapを生成する場合(キーがInteger、値がString)
	Map<Integer, String> map1 = new HashMap<Integer, String>();

	// TreeMapを生成する場合(キー、値共にString)
	Map<String, String> map2 = new TreeMap<String, String>();
	
	static Set<String> set1 = new HashSet<String>();

	// LinkedHashSetを生成する場合
	Set<Integer> set2 = new LinkedHashSet<Integer>();
	
	
	public static void main(String[] args) {
	// 要素を追加する
	map1.put(0, "ぶどう");
	map1.put(3, "もも");

	// 登録済みのキーで追加すると上書きされる
	map1.put(0, "マスカット");
	
	map1.get(0); // マスカットを返す
	map1.get(1); // nullを返す
	
	// キーの存在チェック (trueを返す)
	map1.containsKey(0);

	// 値の存在チェック (falseを返す)
	map1.containsValue("ぶどう");
	
	map1.size();
	
	set1.add("スイカ");
	set1.add("メロン");
	
	// 存在チェック (trueを返す)
	set1.contains("スイカ");

	// 存在チェック (falseを返す)
	set1.contains("なし");
	
	set1.size(); // 2を返す
	
	// 要素を削除する (要素が文字列の場合、文字列として同じであれば削除されます)
	set1.remove("スイカ"); // 戻り値はtrue
	set1.remove("なし"); // 何もしない、戻り値はfalse
	
	List<String> prefectures = new ArrayList<>();
	prefectures.add("北海道");
	prefectures.add("青森県");
	prefectures.add("秋田県");

	for (String prefecture : prefectures) {
	  System.out.println(prefecture); // 北海道、青森県、秋田県の順に表示
	}
	}
	

}
