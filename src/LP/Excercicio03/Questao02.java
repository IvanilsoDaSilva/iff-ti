package LP.Excercicio03;

import java.util.Scanner;
import java.util.Random;

public class Questao02 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
	    float numero, soma = 0;
	    int contador = 1;
	    
	    System.out.print("Programa para somar 100 numeros por while.\n");
	    while (contador <= 100) {
	      System.out.print("Insira o numero: ");
	      numero = INPUT.nextFloat();
	      soma = soma + numero;
	      contador++;
	    }
	    System.out.print("A soma é: " + soma);
	}
}
// Author : Ivanilso da Silva Conceição Filho