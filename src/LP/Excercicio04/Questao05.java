package LP.Excercicio04;

import java.util.Scanner;
import java.util.Random;

public class Questao05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    Random random = new Random();
	    char opcao;
	    double saldo=random.nextFloat(), aux;
	    System.out.print("Programa de banco eletronico.");
	    System.out.print("\n-------------\n|a - Depósito|\n|b - Retirada|\n|c - Saldo   |\n|d - Sair    |\n-------------");
	    System.out.print("\nInsira a opção: ");
	    opcao = input.next().charAt(0);
	    while(opcao!='d'){
	      if (random.nextInt(2)==1) {
	        switch(opcao){
	          case 'a': 
	            System.out.print("\nInsira o valor do depósito: ");
	            aux = input.nextFloat();
	            saldo = saldo + aux;
	            System.out.print("\nDepósito realizado com sucesso!(por case)");
	            break;
	          case 'b': 
	            System.out.print("\nInsira o valor da retirada: ");
	            aux = input.nextFloat();
	            if (saldo >= aux){
	              saldo = saldo - aux;
	              System.out.print("\nRetirada realizada com sucesso!(por case)");
	            }
	            else {
	              System.out.print("\nSaldo insuficiente!(por case)");
	            }
	            break;
	          case 'c': 
	            System.out.printf("\n-------------\n|Saldo: %.2f|\n-------------(por case)",saldo);
	            break;
	          default:
	            System.out.print("\nErro! Opção inválida.(por case)");
	          }
	      }
	      else {
	        if (opcao=='a'){
	          System.out.print("\nInsira o valor do depósito: ");
	          aux = input.nextFloat();
	          saldo = saldo + aux;
	          System.out.print("\nDepósito realizado com sucesso!(por if)");
	        }
	        else{
	          if (opcao=='b') {
	            System.out.print("\nInsira o valor da retirada: ");
	            aux = input.nextFloat();
	            if (saldo >= aux){
	              saldo = saldo - aux;
	              System.out.print("\nRetirada realizada com sucesso!(por if)");
	            }
	            else {
	              System.out.print("\nSaldo insuficiente!(por case)");
	            }
	          }
	          else {
	            if (opcao=='c') {
	              System.out.printf("\n-------------\n|Saldo: %.2f|\n-------------(por if)",saldo);
	            }
	            else {
	              System.out.print("\nErro! Opção inválida.(por if)");
	            }
	          }
	        }
	      }
	      

	      System.out.print("\n-------------\n|a - Depósito|\n|b - Retirada|\n|c - Saldo   |\n|d - Sair    |\n-------------");
	      System.out.print("\nInsira a opção: ");
	      opcao = input.next().charAt(0);
	    }
	}
}
// Author : Ivanilso da Silva Conceição Filho