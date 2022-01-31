package exam2;

import java.util.Scanner;

public class E2_05 {
	private static final String LESS_THAN="<";
	private static final String GREATER_THAN= ">";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("メッセージ>");
		String message = sc.next();
		sc.close();
		boolean isGreaterThan = message.contains(GREATER_THAN);
		boolean isLessThan = message.contains(LESS_THAN);
		if (isLessThan||isGreaterThan) {
			System.out.println("入力禁止文字を検知しました。");
		}else {
			System.out.println("投稿しました。");
		}
		

	}

}
