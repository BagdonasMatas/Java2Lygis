package app;

import java.util.Random;
import java.util.Scanner;

public class UzduotisNr2 {

	public static void main(String[] args) {
		Random random = new Random();
		String[] produktai = new String[] {"duona", "suris", "jogurtas", "ketcupas", "sviestas"};
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Iveskite produkto pavadinima:");
		String pavadinimas = sc.next();
		
		System.out.println(pavadinimas + " labai skanu su " + produktai[random.nextInt(5)]);
		
		
		sc.close();
	}

}
