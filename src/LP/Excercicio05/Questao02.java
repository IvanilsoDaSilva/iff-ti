package LP.Excercicio05;

import java.util.Scanner;
import java.util.Random;

public class Questao02 {
	public static void main(String[] args) {
		String nome, nomeMaisAlta="vazio";
	    double altura, somaAltura=0, maiorAltura=0, menorAltura=100;
	    int contador;
	    Scanner input = new Scanner(System.in);
	    System.out.print("Programa para calcular media de alturas, altura mais baixa e alta.\n");
	    for(contador = 1; contador<= 20; contador++){
	      System.out.print("Insira o nome: ");
	      nome = input.nextLine();
	      System.out.print("Insira a altura: ");
	      altura = input.nextFloat();
	      input.nextLine();
	      if(menorAltura>=altura){
	        menorAltura = altura;
	      }
	      if(maiorAltura<=altura){
	        maiorAltura = altura;
	        nomeMaisAlta = nome;
	      }
	      somaAltura=somaAltura+altura;
	    }
	    System.out.print("Media das alturas: " + somaAltura/20.0);
	    System.out.print("\nAltura mais baixa: " + (menorAltura));
	    System.out.print("\nPessoa mais alta: " + nomeMaisAlta);
	}
}
// Author : Ivanilso da Silva Conceição Filho