package s1a120;

import java.util.Scanner;
public class Rensyu8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String grade;
		System.out.print("得点を入力＞");
		int marks= sc.nextInt(); 
		if(marks<50) {
			grade="D";
		}else if(marks<=69) {
			grade="C";
		}else if(marks<=89) {
			grade="B";
		}else {
			grade="A";
		}
			
		System.out.println("評価は"+grade+"です");
		sc.close();
	}

}
