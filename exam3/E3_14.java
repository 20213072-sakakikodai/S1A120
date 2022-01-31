package exam3;
import java.util.Random;
import java.util.Scanner;
public class E3_14 {
	private static final int MIN_HERO_HP=50;
	private static final int MAX_HERO_HP=100;
	private static final int MIN_SLIME_ATTACK_POINT =10;
	private static final int MAX_SLIME_ATTACK_POINT =20;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("勇者の名前を入力>");
		String heroName = sc.next();
		Random rnd = new Random();
		int heroHp = rnd.nextInt(MAX_HERO_HP-MIN_HERO_HP)+MIN_HERO_HP;
		boolean gameOver = false;
		System.out.printf("勇者%sのHP:%d\n",heroName,heroHp);
		System.out.println("スライムが現れた!!");
		for(int i=1;i<=5; i++) {
			System.out.printf("【ターン"+i+"】勇者%sのHP:%d \n",heroName,heroHp);
			System.out.printf("スライムの攻撃！\n");
			int slime_attack = rnd.nextInt( MAX_SLIME_ATTACK_POINT-MIN_SLIME_ATTACK_POINT)+MIN_SLIME_ATTACK_POINT;
			System.out.printf("勇者%sは%dのダメージを受けた！\n",heroName,slime_attack);
			heroHp-=slime_attack;
			if(heroHp<=0) {
				gameOver=true;
				heroHp=0;
				break;
			}
		
		
		}
		System.out.printf("勇者%sの最終HP:%d\n",heroName,heroHp);
		if (!gameOver) {
			System.out.println("スライムは逃げていった...GAME CLEAR！！");
		}else {
			System.out.println("勇者は死んでしまった...GAME　OVER...");
		}
		sc.close();
		
	}

}
