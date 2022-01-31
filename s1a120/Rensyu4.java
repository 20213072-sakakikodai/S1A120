package s1a120;
import java.util.Scanner;

public class Rensyu4 {
	public static void main(String[] args) {
		String name;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.print("名前を入力してください");
		name = sc.nextLine();
		System.out.print(name +"さんは、何歳ですか？＞");
		age = Integer.parseInt(sc.nextLine());
		System.out.println(name+"さんは若く見えますね");
		System.out.println(age-5+"歳くらいだと思いました");
		sc.close();
	}
	
}
