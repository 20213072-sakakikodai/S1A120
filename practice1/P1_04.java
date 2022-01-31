package practice1;

public class P1_04 {

	public static void main(String[] args) {
		int[ ] ten = {45,55,65,76,85};
		P1_04_Calc calc = new P1_04_Calc();
		int addResult = calc.add(ten);
		System.out.println("合計="+addResult);
		
		int avgResult = calc.avg(ten);
		System.out.println("平均="+avgResult);
		
		int maxResult = calc.max(ten);
		System.out.println("最大値="+maxResult);
		
		int minResult = calc.min(ten);
		System.out.println("最小値="+minResult);
	}

}
