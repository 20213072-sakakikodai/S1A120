package exam1;

import java.util.Scanner;

public class E1_06 {

	public static void main(String[] args) {
		double bmi;
		double height;
		double m_height;
		double weight;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("身長を入力してください(cm)>");
		height = sc.nextDouble();
		System.out.println("体重を入力してください(kg)");
		weight = sc.nextDouble();
		m_height = height/100;
		bmi = weight/(m_height*m_height);
		System.out.println("あなたのBMIは"+String.format("%.2f",bmi)+"です");
		sc.close();
		

	}

}
