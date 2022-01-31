package exam3;

public class E3_06 {

	public static void main(String[] args) {
		int[] testResults = {50,55,68,74,55,83,46,65,76,80};
		int count = 0;
		for(int i=0;i<testResults.length;i++) {
			if(testResults[i]>=60) {
				count++;
			}
		}
		System.out.println(testResults.length+"人中、"+count+"人合格");
		

	}

}
