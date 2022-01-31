package sample;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Sample10 {
	public static void main(String[] args) {
		try {
			/* クラスライブラリを使用するための準備 */
			Scanner sc = new Scanner(new File("test.txt"));

			/* テキストファイルの文字列読み込み */
			while (sc.hasNext()) {
				/* 読み込んだメッセージを出力 */
				String data = sc.next();
				System.out.println(data);
			}
			/* テキストファイルからの文字列読み込みを終了 */
			sc.close();

		} catch (IOException e) {
			/* エラー発生時のメッセージを出力 */
			System.out.println(e + "例外が発生しました");
		}
	}
}
