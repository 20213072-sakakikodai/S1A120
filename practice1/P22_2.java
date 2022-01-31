package practice1;

public class P22_2 {

	public static void main(String[] args) {
		P22_2subA ap = new P22_2subA();
		P22_2subB bp = new P22_2subB();
		System.out.println("main");
		ap.disp1();
		ap.disp2();
		bp.show1(ap.disp4());
	}
}
	class P22_2subA{
		public void disp1() {
			System.out.println("disp1");
		}
		public void disp2() {
			System.out.println("disp2");
			disp1();
		}
		public void disp3() {
			System.out.println("disp3");
			disp1();
			disp2();
		}
		public int disp4() {
			System.out.println("disp4");
			return 2;
		}
	}
	class P22_2subB{
		public void show1(int a) {
			System.out.println("show1");
			for( ; a>0 ; a--) {show2();}
		}
		public void show2() {
			System.out.println("show2");
		}
	}
