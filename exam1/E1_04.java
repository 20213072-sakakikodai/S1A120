package exam1;

import java.util.Scanner;

public class E1_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("【電卓】");
		System.out.println("数値1を入力>");
		int num1 = sc.nextInt();
		System.out.println("数値2を入力>");
		int num2 = sc.nextInt();
		int ans;
		ans = num1+num2;
		System.out.print("計算結果は"+ans+"です。");
		

	}

}
