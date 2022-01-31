package exam3;

import java.util.Scanner;

public class E3_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("購入金額>");
		int price = sc.nextInt();
		System.out.println("分割払いシュミレーション開始");
		int[] monthlyPays=new int[12];
		int tempPay = (int)(Math.floor(price/12/10)*10);
		monthlyPays[0] = price-tempPay*11;
		for(int i =1; i<monthlyPays.length;i++) {
			monthlyPays[i]= tempPay;
		}
		int totalPay=0;
		for (int i = 0; i< monthlyPays.length; i++) {
			System.out.print((i+1)+"ヶ月"+"\t");
			System.out.print(String.format("%,d", monthlyPays[i])+"円"+"\n");
			totalPay +=monthlyPays[i];
		}
		System.out.println("合計金額:"+String.format("%,d", totalPay)+"円"+"\t");
		System.out.println("分割払いシュミレーション終了");
		sc.close();
	}

}
