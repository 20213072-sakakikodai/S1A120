package s1a120;

public class Rensyu12 {

	public static void main(String[] args) {
		String name, maker;
		name = Rensyu12.Getname();
		maker = Rensyu12.Getmaker();
		Rensyu12.showMessage(maker,name);
	}
	public static String Getname() {
		String name = "情報太郎";
		return name;
	}
	public static String Getmaker() {
		String maker = "北海道情報専門学校";
		return maker;
	}
	public static void showMessage(String maker,String name) {
		System.out.println("私は"+maker+"の"+name+"です。");
		return;
	}
		
}
