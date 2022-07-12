package app;

import java.util.Scanner;

public class UzduotisNr1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String sakinys = new String();
		String tarpinis = new String();
		
		System.out.println("Iveskite sakini is 6 zodziu");
		sakinys = sc.nextLine();
		
		String[] sakinysMas = sakinys.split(" ");
		
		for(int i = 0 ; i < sakinysMas.length/2 ; i ++) {
			tarpinis = sakinysMas[i];
			sakinysMas[i] = sakinysMas[sakinysMas.length-i-1];
			sakinysMas[sakinysMas.length-i-1] = tarpinis;
		}
		
		for(int i = 0 ; i < sakinysMas.length ; i ++) {
			System.out.println(sakinysMas[i]);
		}

		sc.close();
	}

}
