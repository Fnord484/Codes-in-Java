package programinhas;

import java.util.Scanner;

public class Maior_Ou_Menor_De_Idade {
    
    public static void main(String[] args){
        
      Scanner input = new Scanner(System.in);
      
      
    
      System.out.print("Informe seu nome: ");
      java.lang.String nome = input.nextLine(); //o "nextLine" lê várias plavras, diferente do "next" ele 
      //continua lendo depois do espaço
      
      System.out.print("Informe sua idade: ");
      int idade = input.nextInt(); 
      
      System.out.print("Olá "+nome+", você gostaria de fazer o método 1 ou 2?");
      int método = input.nextInt(); //No método 1 a pessoa poderia coloca uma idade negativa e o programa 
      //diria que ela é menor de idade
      
      if(método==1){ //o uduário escolheu o método 1
                   
        if (idade<18){  //"if" seria como caso tal condição
          System.out.println(nome+" você é menor de idade, não pode ir no bar");
      } else{  //"else" seria caso contrário
          System.out.println(nome+" você é maior de idade, beba muito");
        }
        
      }else{ //o usuário escolheu o método 2
          if(idade<1){ //não é possivel colocar uma idade negativa
              System.out.println("Sua idade não faz sentido. Você é burros?");
              
          }else if(idade <18){
              System.out.println(nome+" você é menor de idade, não pode ir no bar");
          }else{
              System.out.println(nome+" você é maior de idade, beba muito");
      }
          
      int x = 10;
      
      if(x==10){ //note que para dizer comparação deves-se usar duas vezes o sinal de igual, pois no caso
          //"(x = 10)" eu estaria alterando o valor da variável para 10, seria uma afirmação não uma comparação        
          System.out.println("\n\n x é = a 10");
      }
    }   
    }
}
