import java.util.Scanner;

public class BMICalculator{
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi, lb, in, ft, height;

		/*System.out.print("Your height in m: ");
		m = keyboard.nextDouble();*/

		System.out.print("Your height (feet only): ");
		ft = keyboard.nextDouble();
		System.out.print("Your height (inches only): ");
		in = keyboard.nextDouble();

		/*System.out.print("Your weight in kg: ");
		kg = keyboard.nextDouble();*/

		System.out.print("Your weight in pounds: ");
		lb = keyboard.nextDouble();

		height = (ft*12) + in;
		m = height/39.37;
		kg = lb/2.20;
		bmi = kg / (m*m);

		System.out.println("Your BMI is " + bmi);
	}
}