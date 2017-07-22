import java.util.Scanner;

public class CoinFlip {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String coin, again = "y";
		int streak = 0;
		boolean gotHeads;

		while (again.equals("y") ) {

			gotHeads = Math.random() < 0.5;
	
			if (gotHeads)
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println("Your flip a coin and it is... " +coin);

			if (gotHeads) {
				streak++;
				System.out.println("\tThat's " +streak+ " in a row...");
				System.out.println("\tWould you like to flip again (y/n)? ");
				again = keyboard.next();
			}

			else {
				System.out.println("\tYou lose everything!! ");
				System.out.println("\tShould have quit when you were aHEAD...");
				streak = 0;
				again = "no";
			}

		}
		System.out.println("Final Score: " +streak);


	}
}

// This is the code for do-while:
		/*
		do {
			gotHeads = Math.random() < 0.5;
			System.out.println(gotHeads);

			if (gotHeads)
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println("Your flip a coin and it is... " +coin);

			if (gotHeads) {
				streak++;
				System.out.println("\tThat's " +streak+ " in a row...");
				System.out.println("\tWould you like to flip again (y/n)? ");
				again = keyboard.next();
			}

			else {
				System.out.println("\tYou lose everything!! ");
				System.out.println("\tShould have quit when you were aHEAD...");
				streak = 0;
				again = "no";
			}
		} while (again.equals("y") );

		System.out.println("Final Score: " +streak);
		*/	