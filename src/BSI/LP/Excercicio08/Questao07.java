package BSI.LP.Excercicio08;

import java.util.Scanner;

class Questao07 {
  static int primo(int x) {
    int i, numero=0;
    for (i = 2; i < x; i++) {
        if (numero % i == 0)
            return 1;
    }
    return 0;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int primeiroNumero, segundoNumero, numero;

    System.out.print("Insira o primeiro valor: ");
    numero = input.nextInt();

    System.out.print("Caracter: " + primo(numero));
  }
}