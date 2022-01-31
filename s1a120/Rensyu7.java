package s1a120;

import java.util.Scanner;

public class Rensyu7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("得点を入力＞");
		int i = sc.nextInt();
		if (i>70) {
			System.out.println("あなたの得点は70点より大きいです");
		}else if(i==70) {
			System.out.println("あなたの得点は70点です");
		}else {
			System.out.println("あなたの得点は70点より小さいです");
		}
		sc.close();
	}

}
