package BSI.LP.Excercicio05;

import java.util.Scanner;
import java.util.Random;

public class Questao01 {
	public static void main(String[] args) {
		String nome, sexo;
	    int contador,contadorDeMulheres=0, contadorDeHomens=0;
	    Scanner input = new Scanner(System.in);
	    System.out.print("Programa para contar homens e mulheres de 10 entradas.\n");
	    for(contador = 1; contador<= 10; contador++){
	      System.out.print("Insira o nome: ");
	      nome = input.nextLine();
	      System.out.print("Insira o sexo[F/M]: ");
	      sexo = input.next();
	      input.nextLine();
	      if(sexo.equals("f") || sexo.equals("F") ){
	        contadorDeMulheres++;
	      } else {
	        contadorDeHomens++;
	      }
	    }
	    System.out.print("Numero de mulheres: " + contadorDeMulheres);
	    System.out.print("\nNumero de homens: " + (contadorDeHomens));
	}
}
// Author : Ivanilso da Silva Conceição Filho