package ciklusok;

public class Ciklusok {

	public static void main(String[] args) {
		int[] array = { 6, 8, 2, 9, 7, 1, 10 };

		// FOR KLASSZIK
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println(sum);
		System.out.println("*");

		// FOR
		int sum1 = 0;
		for (int number : array) {
			sum1 += number;
		}
		System.out.println(sum1);
		System.out.println("**");

		// DO WHILE
		int i = 0;
		int sum2 = 0;
		do {
			sum2 += array[i];
			i++;
		} while (i < array.length);
		System.out.println(sum2);
		System.out.println("***");

		// WHILE
		int j = 0;
		int sum3 = 0;
		while (j < array.length) {
			sum3 += array[j];
			j++;
		}
		System.out.println(sum3);
		System.out.println("****");
	}
}
