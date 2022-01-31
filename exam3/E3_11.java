package exam3;

import java.util.Scanner;

public class E3_11 {
	public static void main(String[] args) throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		System.out.println("2桁の数字を思い浮かべてください");
		for (int i=5; i>0;i--) {
			System.out.print("・");
			Thread.sleep(1000);
		}
		System.out.println("\n数当てられゲーム開始");
		int lower = 0;
		int upper = 99;
		int cnt = 0;
		boolean hit = false;
		while (!hit && lower <= upper) {
			cnt++;
			int middle = (lower+upper)/2;
			System.out.println(middle+"ですか？");
			System.out.print(middle+"より大きければ1,同じなら0,小さければ-1を入力>");
			int x= sc.nextInt();
			if(x==0) {
				hit=true;
			}else if(x>0) {
				lower=middle+1;
			}else {
				upper= middle-1;
			}
			if (hit) {
				System.out.println(cnt+"回目で当てました");
			}else {
				System.out.println("あなたは嘘つきです");
			}
			System.out.println("数当てられゲーム終了");
			sc.close();
		}
		
	}

}
