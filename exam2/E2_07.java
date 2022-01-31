package exam2;

import java.util.Scanner;

public class E2_07 {
	private static final int BASE_PRICE =600;
	private static final int MIDDLE_PRICE =500;
	private static final int PREMIUM_PRICE =400;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("人数>");
		int people = sc.nextInt();
		sc.close();
		
		int price = 0;
		if(people>=20) {
			price = people*PREMIUM_PRICE;
		}else if(people>=5) {
			price = people*MIDDLE_PRICE;
		}else {
			price = people*BASE_PRICE;
		}
		System.out.println("入場料は"+price+"円です");

	}

}
