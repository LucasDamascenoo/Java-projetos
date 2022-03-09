package introducao;

import java.util.Scanner;

public class aula00EntradaDados {
  public static void main(String[] args) {
    
    Scanner numPedido = new Scanner(System.in);

    int num;

    num = numPedido.nextInt();

    System.out.println("Você digitou o numero: " + num);

    numPedido.close();

  }
}
