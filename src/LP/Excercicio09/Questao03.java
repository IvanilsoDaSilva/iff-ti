package LP.Excercicio09;

import java.util.Scanner;
import java.util.Random;

public class Questao03 {
	public static int buscarNome(String nome, String nomes[]) {
		int i;
		
		for (i=0;i<nomes.length;i++) {
			if (nome.equalsIgnoreCase(nomes[i])) {
				return i+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		int i, TAMANHODOARRAY=4;
		String nomes[] = new String[TAMANHODOARRAY], nome;
		
		System.out.print("Programa para buscar um nome em um array de nomes.\n");
		for (i=0;i<nomes.length;i++) {
			System.out.print("Insira um nome: ");
			nomes[i] = INPUT.next();
		}
		System.out.print("\nInsira o nome a ser buscado: ");
		nome = INPUT.next();
		System.out.print("\nRetorno: "+buscarNome(nome, nomes));
	}
} 
// Author : Ivanilso da Silva Conceição Filho