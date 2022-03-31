import java.util.Scanner;

public class RoomCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");

		Scanner scnr = new Scanner(System.in);

		System.out.print("Enter Length:");
		double l = scnr.nextDouble();
		System.out.print("Enter Width:");
		double w = scnr.nextDouble();

		double area = l * w;
		double perimeter = l + l + w + w;
		System.out.println("Area:" + area);
		System.out.println("Perimeter:" + perimeter);

	}

	public static void runagain(String[] args) {
		boolean again = true;
		Scanner scnr = new Scanner(System.in);
		while (again) {
			main(args);
			System.out.println("Continue? (Y/N):");
			String answer = scnr.nextLine();
			if (answer == "Y") {
				again = true;
			} else {
				again = false;
			}

		}
	}
}
