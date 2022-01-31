package sample;

import java.util.Scanner;

public class Sample3 {
	public static void main(String[] args) {
		/* キーボード入力を行うための準備 */
		Scanner sc = new Scanner(System.in);
		/* 文字列を格納する変数の定義 */
		String moji;
		/* 入力された文字列を変数に格納 */
		moji = sc.nextLine();
		/* 入力された文字列を出力 */
		System.out.println(moji);
		sc.close();
	}
}
