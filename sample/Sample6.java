package sample;

public class Sample6 {
	public static void main(String[] args) {
		/* 合計値を格納する変数に初期値(0)を格納 */
		int sum = 0;
		/* カウント階数を格納する変数に初期値(1)を格納 */
		int cnt = 1;
		/* 繰り返し処理を5回行い1～5を加算する */
		while (cnt <= 5) {
			sum = sum + cnt;
			System.out.println(sum);
			cnt++;
		}
		/* 加算結果の合計を出力 */
		System.out.println("合計は" + sum + "です");
	}
}