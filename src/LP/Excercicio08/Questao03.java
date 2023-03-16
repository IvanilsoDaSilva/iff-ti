package LP.Excercicio08;

import java.util.Scanner;

class Questao03 {
  static int multiplicar(int x, int y) {
    int i, result = 0;
    for(i=1; i<=x; i++){
      result = result + y;
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int primeiroNumero, segundoNumero;

    System.out.print("Insira o primeiro valor: ");
    primeiroNumero = input.nextInt();
    System.out.print("Insira o primeiro valor: ");
    segundoNumero = input.nextInt();

    System.out.print("Caracter: " + multiplicar(primeiroNumero, segundoNumero));
  }
}