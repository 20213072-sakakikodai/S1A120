package exam3;

import java.util.Random;
import java.util.Scanner;
public class E3_15 {
	private static final int MIN_HERO_HP=50;
	private static final int MAX_HERO_HP=100;
	private static final int MIN_HERO_ATTACK_POINT = 2;
	private static final int MAX_HERO_ATTACK_POINT = 4;
	private static final int MIN_SLIME_HP = 10;
	private static final int MAX_SLIME_HP = 20;
	private static final int MIN_SLIME_ATTACK_POINT =10;
	private static final int MAX_SLIME_ATTACK_POINT =20;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("勇者の名前を入力>");
		String heroName = sc.next();
		Random rnd = new Random();
		int heroHp = rnd.nextInt(MAX_HERO_HP-MIN_HERO_HP)+MIN_HERO_HP;
		int slimeHp = rnd.nextInt(MAX_SLIME_HP-MIN_SLIME_HP)+MIN_SLIME_HP;
		boolean gameOver = false;
		System.out.printf("勇者%sのHP:%d\n",heroName,heroHp);
		System.out.println("スライムが現れた!!");
		while (true) {
			System.out.printf("【ターン	%d】");
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