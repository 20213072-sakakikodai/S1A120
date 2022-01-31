package practice2;

public class P2_10 {

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
	public static void convertData(int size) {
		String format = String.format("%,d", size);
		int total = format.length();
		int non = format.replace(",", "").length();
		int digit = total -non;
		if(digit == 1) {
			System.out.println(format.subSequence(0, format.length()-4)+"KB");
		}else if(digit == 2) {
			System.out.println(format.subSequence(0, format.length()-8)+"KB");
		}else if(digit == 3) {
			System.out.println(format.subSequence(0, format.length()-11)+"KB");
		}else {
			System.out.println(format+"Byte");
		}
	}
}
