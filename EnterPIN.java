import java.util.Scanner;

public class EnterPIN {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int pin, entry;
		String pass = "pw", pentry;

		pin = 123;

		System.out.println("WELCOME TO THE BANK OF JAVA. ");
		System.out.print("Enter your PASSWORD: ");
		pentry = keyboard.nextLine();	

		while ( ! pentry.equals(pass)) {
			System.out.println("\nINCORRECT PASSWORD.  TRY AGAIN.");
			System.out.print("Enter you PASSWORD: ");
			pentry = keyboard.nextLine(); 
		}

		//System.out.println("WELCOME TO THE BANK OF JAVA. ");
		System.out.print("Enter your PIN: ");
		entry = keyboard.nextInt();

		while ( entry != pin ) {
			System.out.println("\nINCORRECT PIN.  TRY AGAIN.");
			System.out.print("Enter you PIN: ");
			entry = keyboard.nextInt();  
		}
		System.out.println("\nPIN Accepted. ACCOUNT BALANCE IS $435.15");
	}

}
