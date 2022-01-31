package practice2;

public class BMI {
	public double getBmi(double weight, double height) {
		double bmi = weight/(height*height);
		return bmi;
	}
	public double convert(double heightByCm) {
		double height=0; 
		height= heightByCm/100.0;
		return height;
	}
	public double format(double bmi) {
		double result  = 0;
		result = Math.ceil(bmi*100)/100;
		return result;
	}
	public void print (double result) {
		System.out.println("**********");
		System.out.println("*BMI:"+result+"*");
		System.out.println("**********");
	}
}
