package BSI.LP.Excercicio04;

import java.util.Scanner;
import java.util.Random;

public class Questao01 {
	public static void main(String[] args) {
		float numero, somaPositivo = 0;
	    int contador, contadorNegativo=0;
	    Scanner input = new Scanner(System.in);
	    System.out.print("Programa para somar numeros positivos e contar os negativos entre 20 inputs.\n");
	    for (contador = 1; contador <= 20; contador++) {
	      System.out.print("Insira o numero: ");
	      numero = input.nextFloat();
	      if (numero%2 == 0) {
	         somaPositivo = somaPositivo + numero;
	      }
	      else{
	        contadorNegativo++;
	      } 
	    }
	    System.out.print("A soma dos positivos é: " + somaPositivo);
	    System.out.print("\nA quantidade de negativos é: " + contadorNegativo);
	}
}
// Author : Ivanilso da Silva Conceição Filho