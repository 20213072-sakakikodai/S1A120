package exam1;

import java.util.Scanner;

public class E1_05 {

	public static void main(String[] args) {
		int money = 0;
		final int A_PRICE = 5100;
		final int C_PRICE = 2700;
		Scanner sc = new Scanner(System.in);
		System.out.print("大人は何名ですか？>");
		int a_people=sc.nextInt();
		System.out.print("高校生以下は何名ですか？>");
		int c_people= sc.nextInt();
		money = (A_PRICE*a_people)+(C_PRICE*c_people);
		System.out.println("合計"+money+"円になります！");
		System.out.println("どうぞ、お楽しみください！");
		sc.close();

	}

}
