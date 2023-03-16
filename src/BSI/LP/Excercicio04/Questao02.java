package BSI.LP.Excercicio04;

import java.util.Scanner;
import java.util.Random;

public class Questao02 {
	public static void main(String[] args) {
		double numero;
	    int soma = 0;
	    Scanner input = new Scanner(System.in);
	    System.out.print("Programa contar numeros enquanto positivos.");
	    System.out.print("\nInsira o numero: ");
	    numero = input.nextFloat();
	    while (numero > 0.0) {
	      System.out.print("Insira o numero: ");
	      numero = input.nextFloat();
	      soma++;
	    }
	    System.out.print("A soma é: " + soma);
	}
}
// Author : Ivanilso da Silva Conceição Filho