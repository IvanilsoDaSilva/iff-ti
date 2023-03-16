package LP.Excercicio09;

import java.util.Scanner;
import java.util.Random;

public class Questao07 {
	public static String embaralharPalavra(String palavra) {
		Random gerador = new Random();
		String palavraEmbaralhada = "";
		char CharEmbaralhamento[] = new char[palavra.length()], aux;
		int i, posicaoAleatoria;
		
		for (i=0;i<palavra.length();i++) {
			CharEmbaralhamento[i] = palavra.charAt(i);
		}
		for (i=0;i<CharEmbaralhamento.length;i++) {
			posicaoAleatoria = gerador.nextInt(CharEmbaralhamento.length);
			
			aux = CharEmbaralhamento[i];
			CharEmbaralhamento[i] = CharEmbaralhamento[posicaoAleatoria];
			CharEmbaralhamento[posicaoAleatoria] = aux;
		}
		for (i=0;i<CharEmbaralhamento.length;i++){
			palavraEmbaralhada = palavraEmbaralhada + CharEmbaralhamento[i];
		}
		return palavraEmbaralhada;
	}
	
	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner input = new Scanner(System.in);
		String palavra = "";
		
		System.out.print("Programa para embaralhar uma palavra.");
		System.out.print("\nInsira a palavra: ");
		palavra = input.next();
		System.out.printf("%s", embaralharPalavra(palavra));
	}
}
// Author : Ivanilso da Silva Conceição Filho