package practice1;

public class P1_03 {

	public static void main(String[] args) {
		int[ ] ten = {45,55,65,76,85};
		
		int add = add(ten);
		System.out.println("合計="+add);
		
		int avg = avg(ten);
		System.out.println("平均="+avg);
	}
	public static int add(int[] ten){
		int ans=0;
		int x=0;
		int y=ten.length;
		while(x<y) {
			ans+=ten[x];
			x++;
		}
		return ans;
	}
	public static int avg(int[] ten) {
		int ans=0;
		int x=0;
		int y=ten.length;
		int z=0;
		while(x<y) {
			ans+=ten[x];
			x++;
		}
		z=ans/y;
		return z;
	}
}
