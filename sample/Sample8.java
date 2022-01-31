package sample;

public class Sample8 {
	public static void main(String[] args) {
		/* 配列を格納する変数に初期値(80点,70点,90点)を格納 */
		int[] arrayTensu = { 80, 70, 90 };
		/* 合計値を格納する変数の定義 */
		int goukei;
		/* 配列要素(0～2)の加算結果を変数に格納 */
		goukei = arrayTensu[0] + arrayTensu[1] + arrayTensu[2];
		/* 加算結果の合計を出力 */
		System.out.println("合計は" + goukei + "です");
	}
}