package it.epicode.be;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci il tuo nome");
		String nome = in.nextLine();
		System.out.println("Inserisci il tuo cognome");
		String cognome = in.nextLine();
		System.out.println("Inserisci il tuo luogo di residenza");
		String residenza = in.nextLine();
		
		System.out.println(nome+" "+cognome+" "+residenza);
		System.out.println(residenza+" "+cognome+" "+nome);
		in.close();
	}

}
