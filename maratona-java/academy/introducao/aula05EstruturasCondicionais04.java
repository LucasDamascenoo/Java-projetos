package introducao;

import java.util.Scanner;

public class aula05EstruturasCondicionais04 {

  public static void main(String[] args) {
      String faixa = "preta";
      
      switch(faixa){
        case "preta":
          System.out.println("Você éo bichão");
          break;
        case "amarela":
          System.out.println("ta quase o bichao");
          break;
        case "verde":
          System.out.println("Precisa treinar mais um poquinho");
           break;

        default:
          System.out.println("Vamo treinar para chegar nessas faixas");
          break;
      }

  }

}
