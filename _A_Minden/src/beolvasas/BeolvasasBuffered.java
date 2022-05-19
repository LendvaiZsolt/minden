package beolvasas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeolvasasBuffered {

	public static void main(String[] args) {

		System.out.println("Ezt a számot adtad meg: " + intInput());
	}

	// int beolvasás ellenőrzötten;
	public static int intInput() {

		InputStreamReader instream = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(instream);

		String str = null;
		int n = 0;
		boolean ok = true;

		do {
			try {
				System.out.println("Adj meg egy számot!");
				str = input.readLine();
				n = Integer.valueOf(str);
				ok = true;
			} catch (NumberFormatException | IOException e) {
				ok = false;
				System.out.println("Ez nem szám");
			}
		} while (!ok);

		return n;

	}

}
