package practice2;

public class P2_09 {

	public static void main(String[] args) {
		int size = random();
		System.out.println(size);
	}
	public static int random() {
		double random = Math.random();
		int digit = (int)(Math.random()*10)+1;
		double pow =Math.pow(10, digit);
		int ans = (int)(random*pow);
		return ans;
	}
}
