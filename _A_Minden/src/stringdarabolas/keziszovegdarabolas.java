package stringdarabolas;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class keziszovegdarabolas {

	public static void main(String[] args) {

		// adatbekésér egyben, 2 szám és művelet kiszedés, művele, eremény
		float er = kalk();
		System.out.println("Az eredmény: " + er);
	}

	public static float kalk() {
		String str = null;
		float er = 0;

		InputStreamReader instr = new InputStreamReader(System.in);
		BufferedReader inbuf = new BufferedReader(instr);

		try {
			System.out.println("Add meg a műveletet ilyen formában: 'a + b' vagy 'a / b'");
			str = inbuf.readLine();

			String[] adat = str.split(" ");
			float a = Float.parseFloat(adat[0]);
			String muv = adat[1];
			float b = Float.parseFloat(adat[2]);

			switch (muv) {
			case "+":
				er = a + b;
				break;
			case "-":
				er = a - b;
				break;
			case "*":
				er = a * b;
				break;
			case "/":
				if (b == 0) {
					System.out.println("0-val nem osztunk!");
				} else
					er = a / b;
				break;
			default:
				break;
			}

		} catch (IOException e) {
			System.out.println("Hát ez bizony nem az a formátum.");
			System.out.println("Exception");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("Hát ez bizony nem az a formátum.");
		}
		return er;

	}
}

