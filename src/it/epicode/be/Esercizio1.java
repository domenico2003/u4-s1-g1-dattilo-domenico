package it.epicode.be;

import java.util.Arrays;

public class Esercizio1 {

	public static void main (String[] args)
		{
		System.out.println(moltiplicazione(2,6));
		System.out.println(concatenazione("i miei anni: ",20));
		
		String[] arrayProva = {"prima","seconda","terza","quarta","quinta"};
		System.out.println(Arrays.toString(arrayProva));
		System.out.println(Arrays.toString(stringArray(arrayProva,"nuova stringa")));
		}
	static int moltiplicazione(int num1,int num2) {
		return num1 * num2;
	}
	static String concatenazione (String valore,int numero) {
		return valore + numero;
	}
	static String[] stringArray ( String[] array ,String parola) {
		String[] newArray = {array[0],array[1],array[2],parola,array[3],array[4]};
		
		return newArray;
	}
	
	
}
		




