package s1a120;

public class Rensyu10 {

	public static void main(String[] args) {
		int sum= 0;
		for(int i=1; i<=9;) {
			sum+=i;
			i=i+2;
		}
		System.out.println("１～１０の奇数の合計は"+sum+"です");
	}

}
