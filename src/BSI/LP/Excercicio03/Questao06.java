package BSI.LP.Excercicio03;

import java.util.Scanner;
import java.util.Random;

public class Questao06 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
	    int numeroInferior, numeroSuperior, soma = 0, contador;
	    
	    System.out.print("Programa para mostrar e somar numeros de um intervalo.");
	    System.out.print("\nInsira o inicio da contagem: ");
	    numeroInferior = INPUT.nextInt();
	    System.out.print("Insira termino da contagem: ");
	    numeroSuperior = INPUT.nextInt();
	    for (contador = numeroInferior; contador <= numeroSuperior; contador++) {
	      System.out.println(contador);
	      soma = soma + contador;
	    }
	    System.out.println("Soma: " + soma);
	}
}
// Author : Ivanilso da Silva Conceição Filho