package exam3;
import java.util.Scanner;
public class E3_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("借入金額>");
		int loanAmount = sc.nextInt();
		System.out.print("つき好きの返済額>");
		int monthlyRefundAmount = sc.nextInt();
		System.out.println("返済シュミレーション開始");
		int month = 1;
		int monthlyRefundAmountTotal= 0;
		int loanBalance =loanAmount;
		while(loanBalance>0) {
			monthlyRefundAmountTotal += monthlyRefundAmount;
			if(monthlyRefundAmountTotal > loanAmount) {
				monthlyRefundAmountTotal = loanAmount;
			}
			loanBalance = monthlyRefundAmount;
			if (loanBalance<0) {
				loanBalance = 0;
			}
			System.out.print(month+ "ヶ月"+"\t");
			System.out.print(String.format("%,d",monthlyRefundAmountTotal)+"円"+"\t");
			System.out.println(String.format("%,d",loanBalance)+"円"+"\t");
			month++;
		}
		System.out.println("返済シュミレーション終了");
		sc.close();
	}

}
