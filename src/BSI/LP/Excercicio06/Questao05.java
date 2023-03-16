package BSI.LP.Excercicio06;

import java.util.Scanner;
import java.util.Random;

public class Questao05 {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		String nome[][] = new String[2][200], sexo = new String();
		int contador, contadorM = 0, contadorF = 0;
		for (contador = 0; contador < 200; contador++) {
			System.out.print("Informe o sexo, M para masculino ou F para feminino:");
			sexo = entradaTeclado.nextLine();
			System.out.print("Informe o nome: ");
			if (sexo.equalsIgnoreCase("M")) {
				nome[0][contadorM] = entradaTeclado.nextLine();
				contadorM++;
			} else {
				nome[1][contadorF] = entradaTeclado.nextLine();
				contadorF++;
			}
		}
		System.out.println("Nomes do sexo feminino:");
		for (contador = 0; contador < contadorF; contador++) {
			System.out.println(nome[1][contador]);
		}
		System.out.println("Nomes do sexo masculino:");
		for (contador = 0; contador < contadorM; contador++) {
			System.out.println(nome[0][contador]);
		}
	}
}
// Author : Ivanilso da Silva Conceição Filho