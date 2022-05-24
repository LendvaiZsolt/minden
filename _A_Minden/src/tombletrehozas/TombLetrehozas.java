package tombletrehozas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TombLetrehozas {

	public static void main(String[] args) {

		System.out.println("Adja meg a tömb 1. dimenziójának hosszát (1 és 3 között): ");
		int size = intInput();

		String[][] myAddressBook = new String[size][];

		for (int i = 0; i < myAddressBook.length; i++) {
			System.out.println("Add meg az " + (i + 1) + ". nevet:");
			String name = strInput();

			System.out.println("Hány e-mail címe van?");
			int n = intInput();

			myAddressBook[i] = new String[n + 1];
			myAddressBook[i][0] = name;
			for (int j = 1; j <= n; j++) {
				System.out.println("Add meg a " + j + ". email címet:");
				String email = strInput();
				myAddressBook[i][j] = email;
			}
		}
	}

	public static int intInput() {
		Scanner input = new Scanner(System.in);
		boolean ok = true;
		int i = 0;
		do {

			try {
				ok = true;
				i = input.nextInt();
			} catch (InputMismatchException e) {
				ok = false;
				System.out.println("Ez nem szám.");
				input.nextLine();
			}
		} while (!ok || (i < 1 || i > 3));

		return i;
	}

	public static String strInput() {
		Scanner input = new Scanner(System.in);
		// System.out.println("Adj meg egy stringet!");
		String str = input.next();

		return str;
	}
}
