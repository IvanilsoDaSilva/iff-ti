package LP.Excercicio08;

import java.util.Scanner;

class Questao05 {
  static int dividir(int x, int y) {
    if (x%y == 0){
      return 1;
    }
    else {
      return 0;
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int primeiroNumero, segundoNumero;

    System.out.print("Insira o primeiro valor: ");
    primeiroNumero = input.nextInt();
    System.out.print("Insira o primeiro valor: ");
    segundoNumero = input.nextInt();

    System.out.print("Caracter: " + dividir(primeiroNumero, segundoNumero));
  }
}