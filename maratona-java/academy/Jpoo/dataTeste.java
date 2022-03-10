package Jpoo;

public class dataTeste {
    public static void main(String[] args) {

        data dataTati = new data();

        dataTati.dia = 04;
        dataTati.mes = 10;
        dataTati.ano = 1997;

        System.out.printf("%d/%d/%d\n", dataTati.dia,dataTati.mes,dataTati.ano);

        data dataLucas = new data();

        dataLucas.dia = 19;
        dataLucas.mes = 03;
        dataLucas.ano = 1995;

        System.out.printf("%d/%d/%d",dataLucas.dia,dataLucas.mes,dataLucas.ano);



    }
}
