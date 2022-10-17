import java.util.Scanner;

 public class Academico {

   public static float media(float a, float b){
    return(a+b)/2;
  }
   public static float Maior(float a, float b){
    
     float maior = 0;
     if(a>b){
       maior = a;
     }
     else if(b>a){
       maior = b;
  
     }
     return maior;

 
   }

   public static String Situação(float a){
     if(a>=6)
       return "APROVADO";
     else
       return "REPROVADO";
   }

   public static Boolean Aprovado(float a){
      if(a>=6)
       return true;
     else
       return false;
   }
}
