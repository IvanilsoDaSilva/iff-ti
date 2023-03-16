package BSI.LP.Excercicio09;

import java.util.Scanner;
import java.io.IOException;
import java.util.Random;

public class Questao05 {
	public static char[] passarStringParaVetorChar(String palavra) {
		char palavraChar[] = new char[palavra.length()];
		int i;
		
		for(i=0;i<palavra.length();i++) {
			palavraChar[i] = palavra.charAt(i);
		}
		return palavraChar;
	}
	
	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner input = new Scanner(System.in);
		String palavra;
		char palavraChar[];
		int i;
		
		System.out.print("Programa para passar uma palavra para um vetor de caracteres.");
		System.out.print("\nInsira a palavra: ");
		palavra = input.next();
		palavraChar = passarStringParaVetorChar(palavra); 
		
		for (i=0;i<palavraChar.length;i++) {
			System.out.printf("%c\n", palavraChar[i]);
		}
	}
} 
// Author : Ivanilso da Silva Conceição Filho