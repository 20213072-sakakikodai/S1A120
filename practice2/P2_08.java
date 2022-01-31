import practice2.BMI;

public class P2_08 {

	public static void main(String[] args) {
		double weight = Double.parseDouble(args[0]);
		int heightByCm = Integer.parseInt(args[1]);
		BMI bmi = new BMI();
		double height =bmi.convert(heightByCm);
		double result = bmi.getBmi(weight, height);
		double ans = bmi.format(result);
		bmi.print(ans);
		
	}

}
