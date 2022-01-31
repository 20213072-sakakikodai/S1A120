package practice2;

import java.util.Scanner;

public class P2_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("a:");
		int a = sc.nextInt();
		System.out.print("b:");
		int b = sc.nextInt();
		sc.close();
		
		if(a>b) {
			int work = a;
			a = b;
			b = work;
		}
		int ransu = random(a,b);
		System.out.println(a+"以上"+b+"未満の乱数:"+ransu);
	}
	public static int random(int a,int b) {
		int ransu = (int)(Math.random()*(b-a));
		ransu += a;
		return ransu;
	}
}
