import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("My name:");
		myName();

		while (true) {
			String name = "";
			System.out.println("Please type in your name!");
			name = scanner.nextLine();
			System.out.println(name + " = " + sumName(name) + "\n");
			
		}
	}

	public static void myName() {
		String my = "Mara Becker";
		System.out.println(my + " = " + sumName(my) + "\n");
	}

	public static int sumName(String input) {
		input = input.replaceAll("\\s|'|´|`", "");
		input = input.toUpperCase();
		input = input.replaceAll("Ä", "AE");
		input = input.replaceAll("Ü", "UE");
		input = input.replaceAll("Ö", "OE");
		int sum = 0;
		int correction = 64;
		int length = input.length();

		for (int i = 0; i < length; i++) {
			char ascii = input.charAt(i);
			int letterValue = ascii - correction;

			sum = sum + letterValue;
		}
		return sum;
	}

}
