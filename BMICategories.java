import java.util.Scanner;

public class BMICategories {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		double bmi, m, kg, lb, in, ft, height;

		/*System.out.print("Enter your BMI: " );
		bmi = keyboard.nextDouble();
		*/

		System.out.print("Your height (feet only): ");
		ft = keyboard.nextDouble();
		System.out.print("Your height (inches only): ");
		in = keyboard.nextDouble();
		System.out.print("Your weight in pounds: ");
		lb = keyboard.nextDouble();

		height = (ft*12) + in;
		m = height/39.37;
		kg = lb/2.20;
		bmi = kg / (m*m);

		System.out.print ("BMI Category: ");
		if (bmi < 15.0) {
			System.out.println(" very serverly underweight");
		}
		else if (bmi <= 16.0) {
			System.out.println(" serverly underweight");
		}
		else if (bmi < 18.5){
			System.out.println(" underweight");
		}
		else if (bmi < 25) {
			System.out.println(" normal weight");
		}
		else if (bmi < 30) {
			System.out.println(" overweight");
		}
		else if (bmi < 35) {
			System.out.println("moderately obese");
		}
		else if (bmi < 40) {
			System.out.println("severely obese");
		}
		else {
			System.out.println("very severely \" morbidly \" obese");
		}
	}
}