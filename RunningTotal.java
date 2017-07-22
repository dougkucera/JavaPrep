import java.util.Scanner;

public class RunningTotal {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int current = 1, total = 0;

		System.out.println("Type in a bunch of numbers and I'll add them up. ");
		System.out.println("I'll stop when you type a zero. ");

		while (current != 0) {
			System.out.print("Value: ");
			current = keyboard.nextInt();
			total += current;
			System.out.println("The total so far is: " +total);
		}

	System.out.println("The grand total is: " +total);
	}
}

/*		do {
			System.out.print("Value: ");
			current = keyboard.nextInt();
			total += current;
			System.out.println("The total so far is: " +total);
		} while (current != 0);
*/