package s1a120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p149 {

	public static void main(String[] args)throws IOException {
		
		final int Regilar_price = 2000;
		final String FEMALE="F";
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("年齢>");
		int age = Integer.parseInt(br.readLine());
		
		System.out.println("男性はM 女性はFを入力してください。");
		System.out.print("性別>");
		String gender = br.readLine();
		
		int price = Regilar_price;
		
		if(age<18)
		{price /=2;
		}if (gender.equals(FEMALE))
		{price/=2;
		
		System.out.println("入場料は"+price+"円です");
		}

	}

}
