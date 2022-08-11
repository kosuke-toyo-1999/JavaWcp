package practice;

import java.sql.SQLException;

public class Chapter12 {
	public static void main(String[] args) {

		try {
			int array[] = { 1, 3, 5 };
			Chapter12.validIndex(array, 2);
			Chapter12.validIndex(array, 3);

			System.out.println("validIndexの呼び出し終了");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentExceptionが発生しました");
			e.printStackTrace();
		}

		// tryを記述
		try {
			Chapter12.throwSQLException();
			// ・throwSQLExceptionメソッドを呼び出す
			System.out.println("SQLExceptionの呼び出し終了");
			// catchを記述
		} catch (SQLException e) {
			System.out.println("SQLExceptionが発生しました");
			e.printStackTrace();
			// ・SQLExceptionをキャッチして、メッセージとスタックトレースを出力
			System.out.println("throwSQLExceptionの呼び出し終了");
			// ・"throwSQLExceptionの呼び出し終了"のメッセージを出力
		}

		System.out.println("mainメソッド終了");
	}

	// validIndexメソッドを作成
	public static void validIndex(int[] array, int b) {
		System.out.println("インデックス " + b + " の要素は " + array[b] +" です");
		if (array.length > b) {
			throw new IllegalArgumentException(array.length + "はサイズの範囲外です");
		}
		}

	// ・indexがarrayのサイズの範囲内なら、インデックスの要素を出力
	// ・サイズの範囲外なら、IllegalArgumentExceptionをスロー

	public static void throwSQLException() throws SQLException {
		// SQLExceptionは、通常、SQLでエラーの場合に発生する例外
		throw new SQLException("SQLエラーです");
	}
}