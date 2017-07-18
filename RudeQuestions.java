import java.util.Scanner;

public class RudeQuestions {
	public static void main(String[] args) {
		String name;
		int age, iq;
		double weight, income;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Hello, what is your name? ");
		name = keyboard.next();

		System.out.print("Hi " +name+ "! How old are you? ");
		age = keyboard.nextInt();

		System.out.println("So you're " +age+ ", eh? That's not very old.");
		System.out.print("How much do you weigh, " +name+ "? ");
		weight = keyboard.nextDouble();

		System.out.println(weight + "!  Better keep that quiet!!");
		System.out.print("What's your income " +name+ "? ");
		income = keyboard.nextDouble();

		System.out.print("Hopefully that is " +income+ " per hour");
		System.out.println(" and not per year!");


		System.out.print(name+ " what is your IQ? ");
		iq = keyboard.nextInt();
		System.out.println(+iq+", I didn't ask your aga again!");
		
		System.out.print("Well, thanks for answering my rude questions, ");
		System.out.println(name +".");
	}
}

/*A double does not blow up a Double.  A Double adds the .0 if you enter an Int

It does not blow up when you enter a number for a string.  It doesn't becuse strings 
will accept any characters.

Letters and Doubles blow up the age(Int) input.
*/