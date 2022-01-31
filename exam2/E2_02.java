package exam2;

import java.util.Scanner;

public class E2_02 {
	private static final int MIDWINTER_DAY =0;
	private static final int SUMMER_DAY =25;
	private static final int HOT_SUMMER_DAY =30;
	private static final int EXTREMELY_HOT_DAY =35;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("最高気温>");
		int maxTemp = sc.nextInt();
		sc.close();
		if (maxTemp>=EXTREMELY_HOT_DAY) {
			System.out.println("猛暑日:"+maxTemp);
		}else if(maxTemp>=HOT_SUMMER_DAY) {
			System.out.println("真夏日:"+maxTemp);
		}else if(maxTemp>=SUMMER_DAY) {
			System.out.println("夏日:"+maxTemp);
		}else if(maxTemp<MIDWINTER_DAY) {
			System.out.println("真冬日:"+maxTemp);
		}

	}

}
