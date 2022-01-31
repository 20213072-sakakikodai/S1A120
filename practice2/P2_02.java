package practice2;

import java.util.Scanner;

public class P2_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("人数:");
		int ninzu = sc.nextInt();
		
		int[] heightArray = new int[ninzu];
		int[] weightArray = new int[ninzu];
		int[] ageArray= new int[ninzu];
		
		for(int i=0;i<ninzu;i++) {
			System.out.print("["+(i+1)+"]"+"身長:");
			heightArray[i] = sc.nextInt();
			System.out.print("　　"+"体重:");
			weightArray[i] = sc.nextInt();
			System.out.print("　　"+"年齢:");
			ageArray[i] = sc.nextInt();
		}
		sc.close();
		
		int maxHeight = max(heightArray);
		System.out.println("身長の最大値は"+maxHeight+"です。");
		int maxWeight = max(weightArray);
		System.out.println("体重の最大値は"+maxWeight+"です。");
		int maxAge = max(ageArray);
		System.out.println("年齢の最大値は"+maxAge+"です。");
	}
	
	public static int max(int[] a) {
		int maxValue = a[0];
		for (int i = 1; i<a.length; i++) {
			if (a[i] > maxValue) {
				maxValue = a[i];
			}
		}
		return maxValue;
	}

}
