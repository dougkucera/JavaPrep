import java.util.Scanner;
public class AgeMessages{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int age;

		System.out.print("How old are you? ");
		age = keyboard.nextInt();

		System.out.println("You are: ");
		if (age < 13) {
			System.out.println("\t too young for Facebook account.");
		}

		if (age >= 13) {
			System.out.println("\t You can create a Facebook account.");
		}

		if (age < 16) {
			System.out.println("\t too young for a drivers license.");
		}

		if (age >= 16) {
			System.out.println("\t You can get a drivers license.");
		}

		if (age < 18) {
			System.out.println("\t too young to get a tattoo.");
		}

		if (age >= 18) {
			System.out.println("\t Go get a tattoo!");
		}

		if (age < 21) {
			System.out.println("\t too young to drink alcohol.");
		}

		if (age >= 21) {
			System.out.println("\t Drink some alcohol, but not too much...");
		}

		if (age < 35) {
			System.out.println("\t too young to run for President.");
			System.out.println("\t\t (How sad!) ");
		}

		if (age >= 35) {
			System.out.println("\t You should run for President. This year demonstrates that anyone can win.");
		}

		if (age >= 65) {
			System.out.println("\t You're old enough to retire!!");
		}
		
	}
}

/* Study Drills
1. Just 'You are' is printed.  Because it is greater than all the condtions
*/