package exam2;

import java.util.Scanner;
public class E2_04 {
	private static final int MIN = 3;
	private static final int MAX = 10;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("名前>");
		String name = sc.next();
		sc.close();
		
		int size = name.length();
		if(size<=MIN&&size>MAX) {
			System.out.println("名前は、３文字以上かつ１０文字以下で入力してください。");
		}else {
			System.out.println(name+"さん、ようこそ。");
		}
	}

}
