package exam2;

import java.util.Scanner;

public class E2_08 {
	private static final double UNDER_WEIGHT = 18.5;
	private static final double NORMAL_WEIGHT =25.0;
	private static final double OBESITY_1 = 30.0;
	private static final double OBESITY_2 = 35.0;
	private static final double OBESITY_3 = 40.0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("身長(m)>");
		double height = sc.nextDouble();
		System.out.print("体重(kg)>");
		double weight = sc.nextDouble();
		sc.close();
		double BMI = sc.nextDouble();
		BMI = weight/(height*height);
		double result = Math.ceil(BMI*100)/100;
		if (result>=OBESITY_3) {
			System.out.println("肥満度:肥満４　BMI:("+result+")");
		}else if(result>=OBESITY_2){
			System.out.println("肥満度:肥満３　BMI:("+result+")");
		}else if(result>=OBESITY_1) {
			System.out.println("肥満度:肥満２　BMI:("+result+")");
		}else if(result>=NORMAL_WEIGHT) {
			System.out.println("肥満度:肥満１　BMI:("+result+")");
		}else if(result>=UNDER_WEIGHT) {
			System.out.println("肥満度:普通体重　BMI:("+result+")");
		}else {
			System.out.println("肥満度:低体重　BMI:("+result+")");
		}
		

	}

}
