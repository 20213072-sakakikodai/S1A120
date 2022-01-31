package exam1;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class E1_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time;
	    String message;
	    Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		time =format.format(date);
		System.out.print("メッセージを入力＞");
		message=sc.next();
	    System.out.println(time+" "+message);
	     

	}

}
