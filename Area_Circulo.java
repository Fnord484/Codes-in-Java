package programinhas;

import java.util.Scanner;

public class calculandoArea_3{
    
    public static void main (String[] args){
        
    final int x = 10;   //a palavra "final" declara o dado inteiro como constante 
    
    final double PI = 3.1456;
    Scanner input= new Scanner(System.in);
    
    System.out.println("informe o raio");
    double raio = input.nextDouble();
    
    double area = PI*raio*raio;
    
    System.out.println("a área do circulo é "+area);
            
         
        
        
        
        
    }
}
