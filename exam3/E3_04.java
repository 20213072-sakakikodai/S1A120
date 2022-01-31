package exam3;

import java.util.Scanner;

public class E3_04 {

	public static void main(String[] args) throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		System.out.print("秒数を入力>");
		int second = sc.nextInt();
		System.out.println("カウントダウン開始");
		// TODO
		for (int i = second; i>0; i--) {
			System.out.print(i+" ");
			Thread.sleep(1000);
		}
		System.out.println("0");
		System.out.println("カウントダウン終了");
		sc.close();
	}

}
