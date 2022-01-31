package exam3;

import java.util.Scanner;

public class E3_01 {

	public static void main(String[] args) {
		double bmi;
		double height;
		double m_height;
		double weight;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("身長を入力してください(cm)>");
		height = sc.nextDouble();
		System.out.print("体重を入力してください(kg)>");
		weight = sc.nextDouble();
		m_height = Math.pow(height,2);
		System.out.println(" 体重    BMI");
		double low_weight = weight-5.0;
		double high_weight = weight+5.0;
		m_height = height/100;
		while (low_weight <= high_weight) {
			bmi = low_weight / Math.pow(m_height, 2);
			System.out.println(low_weight+"kg\t" + (double)Math.round(bmi*100)/100);
			low_weight++;
		}
		sc.close();
			
		
	}

}
