package beolvasas;

import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.xml.stream.util.StreamReaderDelegate;

public class BeolvasasScanner {

	public static void main(String[] args) {

		System.out.println("Ezt a számot adtad meg: " + intInput());
		System.out.println("Ezt a strinegt adtad meg: " + strInput());
		System.out.println("Most meg ezt az új számot adtad meg: " + intInput2());
	}

	// int beolvasása ellenőrzöttten I.; Main metóduson kívül!
	public static int intInput() {
		Scanner input = new Scanner(System.in);
		boolean ok = true;
		int i = 0;
		do {
			try {
				ok = true;
				System.out.println("Adj meg egy számot!");
				i = input.nextInt();
			} catch (InputMismatchException e) {
				ok = false;
				System.out.println("nem szám.");
				input.nextLine();
			}
		} while (!ok);

		return i;
	}

	// int beolvasása ellenőrzöttten II.; Main metóduson kívül!
	public static int intInput2() {
		Scanner input = new Scanner(System.in);
		int n = 0;

		do {
			System.out.println("Adj egy új számot 1 és 10 között!");
			while (!input.hasNextInt()) {
				System.out.println("Ez nem szám!");
				input.nextLine();
			}
			n = input.nextInt();
			// input.nextLine();
		} while (n < 1 || n > 10);
		return n;
	}

	// int beolvasása ellenőrzöttten III.; Main metóduson kívül!
	public static int intin() {
		int i = 0;
		Scanner input = new Scanner(System.in);
		do {
			try {
				do {
					System.out.println("Adj meg egy számot 1 és 10 között!");
					i = input.nextInt();
				} while (i < 1 || i > 10);

			} catch (Exception e) {
				System.out.println("Ez nem szám.");
				input.nextLine();
			}
		} while (i < 1 || i > 10);
		return i;

	}

	// String beolvasása; Main metóduson kívül!
	public static String strInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Adj meg egy stringet!");
		String str = input.next();

		return str;
	}

}
