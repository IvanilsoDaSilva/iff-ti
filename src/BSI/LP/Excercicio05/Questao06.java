package BSI.LP.Excercicio05;

import java.util.Scanner;
import java.util.Random;

public class Questao06 {
	public static void main(String[] args) {
		String nome = new String();
	    int contador;
	    Scanner input = new Scanner(System.in);

	    System.out.print("Programa que escreve um nome na vertical");

	    System.out.print("\nInsira o nome: ");
	    nome = input.nextLine();

	    for(contador=0; contador<=nome.length()-1;contador++){
	      System.out.println(nome.charAt(contador));
	    }
	}
}
// Author : Ivanilso da Silva Conceição Filho