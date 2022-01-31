package exam2;

import java.util.Scanner;

public class E2_03 {
	private static final double MIN_TEMP = 34.0;
	private static final double STANDARD_TEMP = 37.5;
	private static final double MAX_TEMP = 42.0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("体温>");
		double temp = sc.nextDouble();
		sc.close();
		if((temp>=MAX_TEMP)||(temp<=MIN_TEMP)) {
			System.out.println("入力値が正しくありません:"+temp);
		}else if(temp>=STANDARD_TEMP) {
			System.out.println("NG:"+temp);
		}else {
			System.out.println("OK"+temp);
		}

	}

}
