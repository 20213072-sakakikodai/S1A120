package sample;

public class Sample3_1 {
	public static void main(String[] args) {
		/* int型とdouble型の変数を定義 */
		int avgI;
		double avgD;
		/* 平均点を変数avgDに代入する */
		avgD = ((84 + 87 + 85 + 82) / 4.0);
		/* キャストをせずint型の変数にdouble型の値を代入する */
		// FIXME
		avgI = (int)avgD;
		/* 平均点を出力 */
		System.out.println("平均点は" + avgD + "点です");
	}
}
