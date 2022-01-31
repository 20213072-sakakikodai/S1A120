package exam3;
import java.util.Scanner;
public class E3_08 {
	private static final String[] STUDENTNUMBER_LIST = { "","20213901","20213902","20213903","20213904","20213905","20213906"};
	public static void main(String[] args) {
		int[] scores= new int[STUDENTNUMBER_LIST.length];
		System.out.println("成績登録開始");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<STUDENTNUMBER_LIST.length; i++) {
			System.out.print("点数>");
			scores[i] = sc.nextInt();
		}
		System.out.println("成績確認(ソート前)");
		for(int i=1;i<STUDENTNUMBER_LIST.length;i++) {
			System.out.println(STUDENTNUMBER_LIST[i]+":"+scores[i]);
		}
		int[] scoreRankIndex = new int[STUDENTNUMBER_LIST.length];
		for(int s=0; s<scores.length-1;s++) {
			int pos=s;
			for(int i=s+1; i<scores.length;i++) {
				if(scores[i]>scores[pos]) {
					pos=i;
				}
			}
			String ws = STUDENTNUMBER_LIST[s];
			STUDENTNUMBER_LIST[s]=STUDENTNUMBER_LIST[pos];
			STUDENTNUMBER_LIST[pos]=ws;
			int w=scores[s];
			scores[s]= scores[pos];
			scores[pos]=w;
		}
		double sum=0;
		int cnt=0;
		System.out.println("成績確認（ソート後）");
		for (int i=0;i<scoreRankIndex.length-1;i++) {
			System.out.println(STUDENTNUMBER_LIST[i]+":"+scores[i]);
			sum+= scores[i];
			if(scores[i]<60) {
				cnt++;
			}
		}
		double avg = (double) Math.round(sum/(scores.length-1)*10)/10;
		System.out.println("\nクラス平均："+avg+"点");
		System.out.println("クラス最高点："+scores[0]+"点");
		System.out.println("クラス最低点："+scores[scores.length-2]+"点");
		System.out.println("再試対象者"+cnt+"名");
	
		sc.close();
	}
}