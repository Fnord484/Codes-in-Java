package programinhas;
import java.util.Scanner;

public class identificação_da_família{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println ("Olá, seja bem-vinda ao programa");
        
        System.out.print("Qual a sua idade? ");
        int idade = input.nextInt();
        
        if(idade<1){
            System.out.println("Isto não faz sentido");    
        }else if(idade<20){
            System.out.print("Você é o Rafael ou o Fernando\nQuantos livros você já leu? ");
            int livros = input.nextInt();
            
            if(livros<6){
                System.out.println("Você é o Rafael cara de pastel");
                
            }else{ System.out.println("Você é o Fernando que sempre está cagando");} 
            
        }else{
            System.out.print("Então é o Paulo ou a Angelica\nQual sua altura? ");
            float altura = input.nextFloat();
            if(altura>1.70){
                System.out.println("Você é o Paulo");
            }else{
                System.out.println("Você é a Angelica");
            }
            
            
        }       
    }
}
