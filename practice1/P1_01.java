package practice1;

public class P1_01 {

	public static void main(String[] args) {
		int n1 = 15;
		int n2 = 25;
		
		int add = add(n1,n2);
		System.out.println("加算="+add);
		
		int sub = sub(n1,n2);
		System.out.println("減算="+sub);
		
		int mlt = mlt(n1,n2);
		System.out.println("乗算="+mlt);
		
		int div = div(n1,n2);
		System.out.println("除算="+div);
	}
	
	
	public static int add (int n1, int n2) {
		int answer = 0;
		answer = n1+n2;
		return answer;
	}
	public static int sub (int n1, int n2) {
		int answer = 0;
		answer = n1-n2;
		return answer;
	}
	public static int mlt (int n1, int n2) {
		int answer = 0;
		answer = n1*n2;
		return answer;
	}
	public static int div (int n1, int n2) {
		int answer = 0;
		answer = n1/n2;
		return answer;
	}
}
