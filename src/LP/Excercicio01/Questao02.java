package LP.Excercicio01;

import java.util.Scanner;
import java.util.Random;

public class Questao02 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		float largura, altura, comprimento, volume;
		
	    System.out.print("Programa para calcular volume de caixa d'agua.");
	    System.out.print("\nInsira o valor da largura: ");
	    largura = INPUT.nextFloat();
	    System.out.print("Insira o valor da altura: ");
	    altura = INPUT.nextFloat();
	    System.out.print("Insira o valor do comprimento: ");
	    comprimento = INPUT.nextFloat();
	    volume = altura*largura*comprimento;
	    System.out.print("Valor do volume: "+volume);
	}
}
// Author : Ivanilso da Silva Conceição Filho