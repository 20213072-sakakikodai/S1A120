package sample;

public class Sample11 {
	public static void main(String[] args) {
		/* 数字を格納する変数に初期値(10000)を格納 */
		int kazu = 10000;
		/* 書式を変更した数字を変数に格納 */
		String moji = String.format("%,d", kazu);
		/* 変数に格納した数字を出力 */
		System.out.println("表示: " + moji);
	}
}
