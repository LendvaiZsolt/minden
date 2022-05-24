package listazas;

public class Tomblistazas {

	public static void main(String[] args) {
		
		String[][] myAddressBook = new String[2][3];
		
		printArray(myAddressBook);
	}
	
	private static void printArray(String[][] myAddressBook) {
		for (int i = 0; i < myAddressBook.length; i++) {
			for (int j = 0; j < myAddressBook[i].length; j++) {
				System.out.print(myAddressBook[i][j] + ", ");
			}
		}

	}
	
	/* FOREACH tömb
	 * 	public static void kiir(Homerseklet[] hom) {
		for (Homerseklet h : hom) {
			System.out.println(h);
		}
	}
	*/

}
