package sample;

public class Sample5 {
	public static void main(String[] args) {
		/* 合計値を格納する変数の定義 */
		int sum;
		/* 変数に初期値(0)を格納 */
		sum = 0;
		sum = sum + 1;
		System.out.println(sum);
		sum = sum + 2;
		System.out.println(sum);
		sum = sum + 3;
		System.out.println(sum);
		sum = sum + 4;
		System.out.println(sum);
		sum = sum + 5;
		System.out.println(sum);
		/* 加算結果の合計を出力 */
		System.out.println("合計は" + sum + "です");
	}
}