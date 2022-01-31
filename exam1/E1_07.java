package exam1;
import java.util.Scanner;
public class E1_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("金額>");
		int inputNum = sc.nextInt();
		int resultNum = 0;
		resultNum = (int)Math.ceil(inputNum*1.1);
		System.out.println("￥"+resultNum+"のお買い上げになります");
		sc.close();

	}

}
