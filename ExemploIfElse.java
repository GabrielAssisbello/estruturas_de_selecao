//import java.util.Scanner;

public class ExemploIfElse {
    public static void main (String... args){
        //nome completamente qualificado da classe - fully qualified name

        try (java.util.Scanner leitor = new java.util.Scanner(System.in)) {
           double nota;

            System.out.println("digita ai");
            nota = leitor.nextDouble();
            
            if(nota >=70){
            System.out.println("aprovado");
            }
    
            else{
                System.out.println("reprovado");
            }
        
    }
        
    }
}
