package programinhas;      

import java.util.Scanner;

public class conta_matemática{
    
// calculando o valor da potência média a partir de um valor da resistência
    
    public static void main(String [] args){
        
        Scanner input= new Scanner(System.in);
        
        System.out.print("Digite o valor da resistência:" );
        double numero = input.nextDouble();
        
        double numerador= 1296*numero;
        System.out.println("o numerador é: "+numerador);
        
        double denominador1 = numero*numero;
        System.out.println("o denominador 1 é: "+denominador1);
        
        double denominador2 = 6*numero+9;
        System.out.println("o denominador2 é: "+denominador2);
        
        double denominador_total = denominador1 + denominador2;
        System.out.println("o denominador total é: "+denominador_total);
        
        double potencia = (1296*numero)/(numero*numero + 6*numero + 9);
        
        System.out.print("o valor da potencia é: "+potencia);
        
        
    }
    
}
