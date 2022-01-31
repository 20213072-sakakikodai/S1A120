package exam1;

import java.util.Scanner;

public class E1_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("メールアドレスを入力してください>");
		String mail = sc.next();
		mail = mail+"@sample△このアドレスで登録します。";
		System.out.println(mail);
		
}

}


