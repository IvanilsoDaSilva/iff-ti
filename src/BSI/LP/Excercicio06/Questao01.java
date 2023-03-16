package BSI.LP.Excercicio06;

import java.util.Scanner;
import java.util.Random;

public class Questao01 {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		String nomeDePessoas[] = new String[50];
		int contadorPessoa;
		for (contadorPessoa = 0; contadorPessoa < 50; contadorPessoa++) {
			System.out.print("Informe um nome: ");
			nomeDePessoas[contadorPessoa] = entradaTeclado.nextLine();
		}
		for (contadorPessoa = 49; contadorPessoa >= 0; contadorPessoa--) {
			System.out.println(nomeDePessoas[contadorPessoa]);
		}
	}
}
// Author : Ivanilso da Silva Conceição Filho