package programinhas;
//programa para validar se algum ano é bissexto
import java.util.Scanner;

public class ano_bissexto {
    public static void main(Scanner[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ecolha um ano:");
        int ano = input.nextInt();
        
        if((ano%400==0)||(ano%4==0 && ano%100!=0)){
          System.out.println("Este ano é bissexto.");
        }else{
            System.out.println("Este ano não é bissexto.");
        }
        // Outri jeito de fazer:
        System.out.println("Escolha outro ano:");
        int ano2 = input.nextInt();
        
        boolean x = (ano%400==0)||(ano%4==0 && ano%100!=0);
        
        System.out.println(x);
        
        
        
    }
    
    
}
        
