import java.util.Scanner;

public class aula05EstruturasCondicionais03 {
  public static void main(String[] args) {

    // de 0 a 34712 = 9,72
    // de 34713 a 68507 = 35,35
    // > 68508 49,50

    double salarioAnual = 45607;
    double primeiraFaixa = 9.72 /100;
    double segundaFaixa = 35.35 /100;
    double terceoraFaixa = 49.50 /100;
    double imposto = 0;

    if(salarioAnual <= 34712){
      imposto = salarioAnual* primeiraFaixa;
    }else if ( salarioAnual >34713 && salarioAnual <= 68507){
      imposto = salarioAnual*segundaFaixa;
    }else {
      imposto= salarioAnual*terceoraFaixa;
    }

    System.out.println("o valor que vou ter q pagar de imposto é R$ " + imposto);

    double media = 9.7;

    if(media >9 && media <10){
      System.out.println("Parabens, você foi muito bem");
    }else if (media >6 && media <9){
      System.out.println("Você passou, mas n foi excelente");
    }else {
      System.out.println("reprovado, vamos melhor");
    }

    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite uma nota: ");
    double nota = entrada.nextDouble();

    if(nota > 10 ||nota <0){
      System.out.println("Digite uma nota correta");
    } else if (nota >= 8.1){
      System.out.println("Voce tirou um A");

    } else if (nota >= 6.1){
      System.out.println("vocẽ tirou um B");
    }else if (nota >= 4.1){
      System.out.println("vocẽ tirou um B");  
    }else if (nota >= 2.1){
      System.out.println("vocẽ tirou um B");

    }else {
       System.out.println("reprovado");
    }

entrada.close();
  } 

}