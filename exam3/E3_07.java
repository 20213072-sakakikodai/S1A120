package exam3;

import java.util.Scanner;

public class E3_07 {
	private static final String[] studentNumberList = { "","20213901","20213902","20213903","20213904","20213905"};
	private static final String[] phoneNumberList = {"","090-1111-1111","090-2222-2222","090-3333-3333","090-4444-4444","090-5555-5555"};
	
	public static void main(String[] args) {
		System.out.println("電話番号検索開始");
		Scanner sc = new Scanner(System.in);
		System.out.print("学籍番号>");
		String studentNumber = sc.nextLine();
		int index = 0;
		sc.close();
		for(int i=0; i<studentNumberList.length; i++) {
			if (studentNumberList[i].equals(studentNumber)) {
				index=i;
			}
		}
		if (index !=0) {
			System.out.println("電話番号:"+phoneNumberList[index]);
		}else {
			System.out.println("該当する生徒が存在しません");
		}
	}
}