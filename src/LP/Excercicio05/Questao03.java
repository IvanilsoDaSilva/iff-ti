package LP.Excercicio05;

import java.util.Scanner;
import java.util.Random;

public class Questao03 {
	public static void main(String[] args) {
		String nome, nascionalidade, sexo, nomePessoaMaisPesada="inexiste", mulherBRMenosPesada="inexiste";
	    double peso, somaPeso=0, maiorPeso=0, menorPeso=1000;
	    int contador=0;
	    Scanner input = new Scanner(System.in);
	    System.out.print("Pegar dados enquanto nome e diferente de \"SAIR\".");
	    System.out.print("\nInsira o nome: ");
	    nome = input.nextLine();
	    while(!nome.equals("SAIR")){
	      System.out.print("Insira a nascionalide[sigla]: ");
	      nascionalidade = input.nextLine();
	      System.out.print("Insira o sexo[M/F]: ");
	      sexo = input.nextLine();
	      System.out.print("Insira o peso: ");
	      peso = input.nextFloat();
	      input.nextLine();
	      contador++;
	      somaPeso = somaPeso + peso;
	      if(maiorPeso<peso){
	        maiorPeso = peso; nomePessoaMaisPesada = nome;
	      }
	      if((menorPeso>peso) && (sexo.equals("F") || sexo.equals("f"))&&(nascionalidade.equals("br"))||(nascionalidade.equals("Br"))||(nascionalidade.equals("BR"))){
	        mulherBRMenosPesada = nome; menorPeso=peso;
	      }
	      
	      System.out.print("\nInsira o nome: ");
	      nome = input.nextLine();
	    }
	    System.out.print("Media dos pesos: "+somaPeso/contador);
	    System.out.print("\nPessoa mais pesada: "+nomePessoaMaisPesada);
	    System.out.print("\nMulher Mais leve: "+mulherBRMenosPesada);
	}
}
// Author : Ivanilso da Silva Conceição Filho