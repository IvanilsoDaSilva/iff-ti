package BSI.LP.Excercicio03;

import java.util.Scanner;
import java.util.Random;

public class Questao03 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
	    int numero, soma = 0;
	    
	    System.out.print("Programa para somar numeros entre 1 e 1000.\n");
	    for (numero = 1; numero <= 1000; numero++) {
	      soma = soma + numero;
	    }
	    System.out.print("A soma é: " + soma);
	}
}
// Author : Ivanilso da Silva Conceição Filho