package introducao;

public class aula04Operadores {
  public static void main(String[] args) {
    // operadores aritmeticos
    // * / ** % + -

    int numero1 = 10;
    int numero2 = 20;
    int conta = numero1 + numero2;

    System.out.println(conta);


    //operadores atribuição  
    //<> <+ >= == !=

    //operadores de atribuição sempre tem q ser inicializar como boolean

    boolean menorQue = 30 < 890;
    boolean maiorQue = 123 > 890;
    boolean maiorIgual = 30 >= 90;
    boolean menorIgual = 30 <= 890;
    boolean diff = 10 == 10.0;

    System.out.println((menorQue));
    System.out.println((maiorQue));
    System.out.println((maiorIgual));
    System.out.println((menorIgual));
    System.out.println((diff));

    //operadores logicos
    // && (e) || ou ! sempre tem q ser inicializar como boolean


    int idade = 29;
    double salario = 3500;
    boolean dentroDaLei = idade >= 30 && salario >= 4612;
    boolean foraDaLei = idade < 30 && salario >= 3381;

    System.out.println("Estou dentro da lei? " + dentroDaLei);
    System.out.println("Estou fora da lei? " + foraDaLei);

    double contaCorrente = 3456;
    double contaPoupanca = 8679;
    double valorPlay5 = 6789;

    boolean possoComprar = contaCorrente >= valorPlay5 || contaPoupanca >= valorPlay5;

    System.out.println("Posso comprar meu ps5? " + possoComprar);
    

    int preco = 8900;
    int desconto = 345;
    preco -= desconto;

    System.out.println(preco);

    int contador = 0;

    contador ++;

    System.out.println(contador);
    

  }
}
