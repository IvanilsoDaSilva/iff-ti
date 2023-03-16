package LP.Excercicio09;

import java.util.Scanner;
import java.util.Random;

public class Questao06 {
	public static String passarVetorCharParaString(char[] caracteres) {
		String string = "";
		int i;
		
		for(i=0;i<caracteres.length;i++) {
			string = string+caracteres[i];
		}
		return string;
	}
	
	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner input = new Scanner(System.in);
		int i, tamanhoArray = 10;
		char caracteres[] = new char[tamanhoArray];
		
		System.out.print("Programa para passar um vetor de caracteres para uma String.\n");
		for (i=0; i<caracteres.length;i++) {
			System.out.print("Insira o caracter: ");
			caracteres[i] = input.next().charAt(0);
		}
		System.out.printf("%s", passarVetorCharParaString(caracteres));
	}
} 
// Author : Ivanilso da Silva Conceição Filho