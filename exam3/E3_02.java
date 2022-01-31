package exam3;

import java.util.Scanner;

public class E3_02 {
	private static final int STRIKE =1;
	private static final int BALL =2;
	private static final int FOUL =3;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int strikeCnt = 0;
		int ballCnt = 0;
		System.out.println("延長戦プレイボール！\n");
		while(strikeCnt<3 && ballCnt<4) {
			System.out.print("ストライク=1 or ボール=2> or ファウル=3>");
			int judge = sc.nextInt();
			if (judge == STRIKE || (strikeCnt < 2 && judge == FOUL)) {
				strikeCnt++;
			}else if(judge == BALL) {
				ballCnt++;
			}
			System.out.println(ballCnt + "ボール,"+ strikeCnt + "ストライク");
		}
		System.out.println("\n延長戦ゲームセット！");
		sc.close();
	}

}
