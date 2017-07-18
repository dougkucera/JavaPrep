import java.util.Scanner;

public class DictionaryOrder {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		String name;

		System.out.print( "Make up the name of a programming language. ");
		name = keyboard.nextLine();

		if (name.compareToIgnoreCase("c++") < 0)
			System.out.println(name + " comes BEFORE c++");
		if (name.compareToIgnoreCase("c++") == 0)
			System.out.println("c++ isn't a made up language! ");
		if (name.compareToIgnoreCase("c++") > 0)
			System.out.println(name + " comes AFTER c++");

		if (name.toLowerCase().compareTo("go".toLowerCase() ) < 0)
			System.out.println(name + " comes BEFORE go");
		if (name.toLowerCase().compareTo("go".toLowerCase() ) == 0)
			System.out.println("go isn't a made up language! ");
		if (name.toLowerCase().compareTo("go".toLowerCase() ) > 0)
			System.out.println(name + " comes AFTER go");

		if (name.compareTo("java") < 0)
			System.out.println(name + " comes BEFORE java");
		if (name.compareTo("java") == 0)
			System.out.println("java isn't a made up language! ");
		if (name.compareTo("java") > 0)
			System.out.println(name + " comes AFTER java");

		if (name.compareTo("lisp") < 0)
			System.out.println(name + " comes BEFORE lisp");
		if (name.compareTo("lisp") == 0)
			System.out.println("lisp isn't a made up language! ");
		if (name.compareTo("lisp") > 0)
			System.out.println(name + " comes AFTER lisp");

		if (name.compareTo("python") < 0)
			System.out.println(name + " comes BEFORE python");
		if (name.compareTo("python") == 0)
			System.out.println("python isn't a made up language! ");
		if (name.compareTo("python") > 0)
			System.out.println(name + " comes AFTER python");

		if (name.compareTo("ruby") < 0)
			System.out.println(name + " comes BEFORE ruby");
		if (name.compareTo("ruby") == 0)
			System.out.println("ruby isn't a made up language! ");
		if (name.compareTo("ruby") > 0)
			System.out.println(name + " comes AFTER c++");

		if (name.compareTo("VB") < 0)
			System.out.println(name + " comes BEFORE VB");
		if (name.compareTo("VB") == 0)
			System.out.println("VB isn't a made up language! ");
		if (name.compareTo("VB") > 0)
			System.out.println(name + " comes AFTER VB");
	}
}