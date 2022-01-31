package practice1;

public class P1_04_Calc {
	public int add(int[] ten) {
		int ans=0;
		int x=0;
		while(x<ten.length) {
			ans+=ten[x];
			x++;
		}
		return ans;
	}
	public int avg(int[] ten) {
		int ans=0;
		int x=0;
		int y=0;
		while(x<ten.length) {
			ans+=ten[x];
			x++;
		}
		y=ans/ten.length;
		return y;
	}
	public int max(int[] n) {
		int x=0;
		int y=0;
		int ans=0;
		while(x<n.length) {
			if(n[x]<n[x+1]) {
				y=n[x];
				n[x]=n[x+1];
				n[x+1]=y;
				x++;
			}
			else if(x>n[x]){
				x++;
			}
		return n[x];
		}
	}

}
