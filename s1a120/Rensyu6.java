package s1a120;
import java.util.Scanner;
public class Rensyu6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("得点を入力＞");
		int i=sc.nextInt();
		if (i>=50) {
			System.out.println("あなたの得点は50点以上です");
		}else {
			System.out.println("あなたの得点は50点未満です");
		}
		sc.close();
	}

}
