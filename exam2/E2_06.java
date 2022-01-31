package exam2;

import java.util.Scanner;

public class E2_06 {
	private static final String NOW_PASSWORD = "hcs1234";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("新しいパスワード>");
		String password = sc.next();
		sc.close();
		if(password.equals(NOW_PASSWORD)) {
			System.out.println("現在のパスワードと同じです。再入力してください。");
		}else {
			System.out.println("変更しました。");
		}

	}

}
