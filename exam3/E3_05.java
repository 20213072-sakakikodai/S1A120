package exam3;

public class E3_05 {

	public static void main(String[] args) {
		String[] results1 = {"秀","優","優","良","秀"};
		String[] results2 = new String[10];
		System.arraycopy(results1, 0, results2, 0, 5);
		for (int i=0; i<results2.length; i++) {
			System.out.print(results2[i]+",");
			
		}
	}

}
