package exam2;
import java.util.Scanner;
public class E2_01 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("指定行>");
		int row = sc.nextInt();
		sc.close();
		int cr = row%2;
		if(cr==1) {
			System.out.println("青色:"+row);
		}else
			System.out.println("白色:"+row);

	}

}
