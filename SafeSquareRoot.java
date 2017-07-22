import java.util.Scanner;

public class SafeSquareRoot {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double x, y;
		String ready = "Yes", s_input;

		System.out.println("Are you ready(Yes/No): ");
		s_input = keyboard.next();

		while (! s_input.equals(ready) ) {
			System.out.println("Let me know when you're ready(Yes/No)? ");
			s_input = keyboard.next();
		}

		System.out.print("Give me a number and I'll find the sq root. ");
		System.out.print("(No negatives please) ");
		x = keyboard.nextDouble();

		while (x < 0) {
			System.out.println("I won't take the sq root of a negative. ");
			System.out.print("\nNew number please: ");
			x = keyboard.nextDouble();
		}

		y = Math.sqrt(x);

		System.out.println("The sq root of " +x+ " is " +y);
	}
}