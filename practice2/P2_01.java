package practice2;

import java.util.Scanner;

public class P2_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("整数値:");
		int number = sc.nextInt();
		sc.close();
		
		int kekka = sign0f(number);
		System.out.println(kekka);

	}
	public static int sign0f(int n) {
		int result = 0;
		if(n<0) {
			result = -1;
		}else if (n==0) {
			result = 0;
		}else {
			result = 1;
		}
		return result;
	}

}
