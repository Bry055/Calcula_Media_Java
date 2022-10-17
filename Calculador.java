import java.util.Scanner;

class Calculador{
  public static void executar(){
  Academico academico = new Academico();
  Calculador calculador = new Calculador();
  
  Scanner scan = new Scanner(System.in);

    
  System.out.println("Bem-Vindo a calculadora de média!\n");

  System.out.println("Insira a nota dos processos avaliativos abaixo\n");
    
  System.out.print("Prova 1: ");
  Float prova1 = scan.nextFloat();

  System.out.print("Prova 2: ");
  Float prova2 = scan.nextFloat();

  System.out.println("A média é: "+academico.media(prova1,prova2));

  
  if(academico.Aprovado(academico.media(prova1,prova2)) == true){
    System.out.print("APROVADO");
    }
  else{ 
    System.out.print("Digite a avaliação substitutiva: ");
    float subs = scan.nextFloat();

    if(academico.Maior(prova1,prova2) == prova1){
      prova1 = subs;


      
    }
    else{

      prova2 = subs;
    }

    float mediafim = academico.media(prova1,prova2);
   

    
      
    

      
     if (academico.Aprovado(mediafim) == true){


       System.out.print("APROVADO");
     }
    else{
      System.out.print("REPROVADO");
    }
      } 
   

  
    }
}