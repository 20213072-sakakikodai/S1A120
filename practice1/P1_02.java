package practice1;

public class P1_02 {

	public static void main(String[] args) {
		int n1 = 15;
		int n2 = 25;
		
		P1_02_Calc calc = new P1_02_Calc();
		int add = calc.add(n1,n2);
		System.out.println("加算="+add);
		
		int sub = P1_02_Calc.sub(n1,n2);
		System.out.println("減算="+sub);
		
		int mlt = P1_02_Calc.mlt(n1,n2);
		System.out.println("乗算="+mlt);
		
		int div = P1_02_Calc.div(n1,n2);
		System.out.println("除算="+div);
	}

}
	