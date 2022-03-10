package introducao;

import java.util.Scanner;

public class aula06LacosRepeticao {
  public static void main(String[] args) {



  /*    // while determinado pois sabemos quantas vezes queremos repetir os valroes

    int num1 = 0; 

    while (num1 <10 )// enquanto a variavel for menor que 10 faça isso  
        {           
    num1 += 1; // estamos acrescentando a incremtação do valor  
             
    System.out.println(num1); 
       
    }  
 */
    //while indeterminado

    Scanner entrada = new Scanner(System.in);

    String valor = "";

    while(!valor.equalsIgnoreCase("sair")) {
      System.out.println("Você diz");
      valor=entrada.nextLine();
    }

    entrada.close();



    
  }
}
