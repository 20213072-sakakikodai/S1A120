package exam3;

import java.util.Scanner;

public class E3_13 {
	private static final String BALSE="バルス";
	public static void main(String[] args) throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		System.out.println("ムスカ>3分間待ってやる");
		for (int i=5;i>0;i--) {
			System.out.print("・");
			Thread.sleep(1000);
		}
		System.out.println("");
		String spell="";
		while (!BALSE.equals(spell)) {
			System.out.println("ムスカ>時間だ、答えを聞こう");
			System.out.print("シータ>");
			spell=sc.nextLine();
		}
		System.out.println("ムスカ>目が、目がぁぁ");
		sc.close();
	}

}
