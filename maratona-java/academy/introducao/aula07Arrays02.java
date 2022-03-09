package introducao;

public class aula07Arrays02 {
    public static void main(String[] args) {
        // quando chamamos arrays vazias o retorno varia de acordo com cada tipo de dado primitivo

        // byte,short,int,long,double,float = 0
        // char = '\u0000
        // boolean = false
        // string null

        String []  texto = new String[4];
        texto[0]= "teste";

        System.out.println(texto[0]);
        System.out.println(texto[1]); // na posição 1 não foi declarado nenhum valor, entao retornar null

    }
}
