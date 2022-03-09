import javax.lang.model.element.Element;

public class aula05EstruturasCondicionais {

  public static void main(String[] args) {


int idade = 19;


String sexo = "M";

if(idade >=18){
  System.out.println("Voce pode entrar na balada");
}else if (idade >= 18 && sexo == "F"){
  System.out.println("você tem desconto na balada");
}else{
  System.out.println("voce n pode entrar");
}




}

}