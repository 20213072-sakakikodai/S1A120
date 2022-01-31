package practice2;

import java.util.Scanner;

public class P2_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("体重(kg):");
		double weight = sc.nextDouble();
		System.out.print("身長(cm):");
		int heightByCm = sc.nextInt();
		sc.close();
		BMI bmi = new BMI();
		
		double height = bmi.convert(heightByCm);
		double result = bmi.getBmi(weight, height);
		System.out.println("BMI:"+result);

	}

}
