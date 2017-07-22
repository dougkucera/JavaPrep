import java.util.Scanner;

public class HighLow{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int secret, guess;

		secret = 1 + (int)(100*Math.random());

		System.out.println("I'm thinking of a # between 1 & 100. ");
		System.out.print("Try to guess it! \n>");
		guess = keyboard.nextInt();

		while (secret != guess) {
			if (guess < secret) {
				System.out.println("Your geuss is too low.");
			}

			if (guess > secret) {
				System.out.println("Your geuss is too high.");
			}
			System.out.println("Try again.");
			guess = keyboard.nextInt();
		}
		System.out.println("You guessed it!!  What are the odds?!?");
	}
}