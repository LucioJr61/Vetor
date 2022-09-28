/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author lucio
 */
public class Main {
    
  /**
   * @param args the command line arguments
   */  
public static void main(String[] args){
    // TODO code application logic here
    Scanner teclado=new Scanner(System.in);//Pronto para ler teclado
    
    System.out.print(" Digite o tamanho do seu vetor: ");
    int n=teclado.nextInt();
    int [] v = new int[n];
    
    
    //Entrada via teclado
    for(int i=0;i<v.length;i++){
     
     System.out.println("   Digite um número: " + " ");
     v[i] = teclado.nextInt();
    } 

    //Saída
    for(int i = 0; i < v.length; i = i+ 1){
   System.out.println(" Na posição "  + i + " Temos: " + v[i]);
    }

   System.out.println();

    System.out.println(maiorDiferenca(v));

   System.out.println(ordemCrescente(v));
}

 public static int maiorDiferenca(int v[]){
   
   int maior= 0;
   int index = 1;

  while(index < v.length){
    int contador=0;
    while(contador < v.length){
      int novo_valor = v[index]-v[contador];
      if (novo_valor > maior){
        maior = novo_valor;
      }
      contador++;
    }
    index++;
  }
   System.out.println (" Maior diferença é: ");
   return maior;
 }
   public static boolean ordemCrescente(int v[]){
     for(int i=1; i<v.length; i++){
       if(v[i]<v[i-1]){
         
        System.out.println(" Esta em ordem crescente? "); 
        return false;
       }
     }
    System.out.println(" Esta em ordem crescente? ");return true;
   }
}
