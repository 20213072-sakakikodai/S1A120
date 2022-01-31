package exam1;

import java.util.Scanner;

public class E1_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("都道府県>");
		String address1 = sc.next();
	      
	      System.out.print("市区町村・番地>");
		String address2 = sc.next();
		address1=address1+address2+"△にお届けしますね！";
		System.out.println(address1);
	}

}
