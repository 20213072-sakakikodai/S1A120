package sample;

public class Sample9 {
	public static void main(String[] args) {
		/* 名前を格納する変数の定義 */
		String name;
		/* 取得した名前を変数に格納 */
		name = getName();
		/* 取得した名前を出力 */
		System.out.println("私は" + name + "です");
	}

	/* 名前を取得するためのメソッド */
	public static String getName() {
		String name = "情報太郎";
		return name;
	}
}