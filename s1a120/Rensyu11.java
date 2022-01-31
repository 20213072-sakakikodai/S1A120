package s1a120;

public class Rensyu11 {

	public static void main(String[] args) {
		int[] arrayAmTen = {70,85,60,65,75};
		int[] arrayPmTen = {80,60,70,65,70};
		int[] arrayTotalTen = new int[5];
		for (int cnt =0; cnt < 5; cnt++) {
			arrayTotalTen[cnt] = arrayAmTen[cnt]+arrayPmTen[cnt];
			System.out.println((cnt+1)+"人目の合計は"+arrayTotalTen[cnt]);
		}

	}

}
