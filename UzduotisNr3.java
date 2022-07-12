package app;

import java.util.Scanner;

public class UzduotisNr3 {

	public static void main(String[] args) {

		int[] skaiciai = { 5, 4, 205, -24, 30 };
		int count = 0;
		int skaic = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Iveskite skaiciu nuo 1 iki 5:");
			skaic = sc.nextInt();
			if (skaic <= 0 || skaic > 5)
				System.out.println("Ivestis nebuvo skaicius tarp 1 ir 5.");
		} while (skaic <= 0 || skaic > 5);

		for (int i = 0; i < skaiciai.length; i++) {
			if (skaiciai[i] == skaic) {
				count++;
			}
		}
		System.out.println("Masyve buvo " + count + " jusu ivesto skaiciaus");
	}

}
