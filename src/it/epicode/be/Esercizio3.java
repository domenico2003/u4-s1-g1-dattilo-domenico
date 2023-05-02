package it.epicode.be;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		
		//perimetroRettangolo();
		//pariDispari();
		//areaTriangolo();
	}
	static void perimetroRettangolo () {
		Scanner in = new Scanner(System.in);
		System.out.println("Calcola il perimetro di un rettangolo");
		System.out.println("Inserisci la lunghezza decimale di un lato del rettangolo");
		double lato1 = in.nextDouble();
		System.out.println("Inserisci la lunghezza decimale di un altro lato del rettangolo");
		double lato2 = in.nextDouble();
		in.close();
		
		System.out.println("il perimetro del rettangolo è: " + ((lato1*2) + (lato2*2)));
	}
	static void pariDispari () {
		Scanner in = new Scanner(System.in);
		System.out.println("Controlla se è pari o dispari");
		System.out.println("Inserisci un numero");
		int numero = in.nextInt();
		in.close();
		String risultato ="";
		int risultatoNumerico =0;
		if(numero%2 == 0) {
			risultato = "pari";
			risultatoNumerico = 0;
			
		}else {
			risultato = "dispari";
			risultatoNumerico = 1;
		}
		System.out.println("Il numero  è: " + risultato );
		System.out.println(risultatoNumerico);
	}
	static void areaTriangolo () {
		Scanner in = new Scanner(System.in);
		System.out.println("Calcola l'area di un triangolo");
		System.out.println("Inserisci la lunghezza decimale di un lato del triangolo");
		double lato1 = in.nextDouble();
		System.out.println("Inserisci la lunghezza decimale di un altro lato del triangolo ");
		double lato2 = in.nextDouble();
		System.out.println("Inserisci la lunghezza decimale di un altro lato del triangolo");
		double lato3 = in.nextDouble();
		in.close();
		
		double semiperimetro = (lato1 + lato2 + lato3) / 2;

	    double area = Math.sqrt(semiperimetro * (semiperimetro - lato1) * (semiperimetro - lato2) * (semiperimetro - lato3));
	    System.out.println("l'area del triangolo è: " + area);
	}
}
