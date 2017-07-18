public class ClubBouncer {
	public static void main(String [] args) {
		int age = 21;
		boolean onGuestList = false;
		double alure = 7.5;
		String gender = "F";

		if (onGuestList || age >= 21 || (gender.equals("F") && alure >= 8.0)) {
			System.out.println("You are allowed to enter the club.");
		}
		//System.out.println("Something here please....");
		else {
			System.out.println("You cannot pass.");
		}
	}
}
/* STUDY DRILL
1.  Does not compile because it is between the if and else statements
*/