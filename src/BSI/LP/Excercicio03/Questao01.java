package BSI.LP.Excercicio03;

import java.util.Scanner;
import java.util.Random;

public class Questao01 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
	    float numero, soma = 0;
	    int contador;
	    
	    System.out.print("Programa para somar 10 numeros por for.\n");
	    for (contador = 1; contador <= 10; contador++) {
	      System.out.print("Insira o numero: ");
	      numero = INPUT.nextFloat();
	      soma = soma + numero;
	    }
	    System.out.print("A soma é: " + soma);
	}
}
// Author : Ivanilso da Silva Conceição Filho