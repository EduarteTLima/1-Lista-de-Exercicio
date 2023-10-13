/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ListaExerciciosUm;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Calendario {
    public static void main(String args[]){
        Scanner mes = new Scanner (System.in);
        
        int meses;
        
        int Jan = 31, Fev = 28, Mar = 31, Abr = 30, Mai = 31, Jun = 30, Jul = 31, Ago = 31, Set = 30, Out = 31, Nov = 30, Dez = 31;
        
            System.out.println("----------------------------------------");
            System.out.println("              01 - Janeiro              ");
            System.out.println("              02 - Fevereiro            ");
            System.out.println("              03 - Março                ");
            System.out.println("              04 - Abril                ");
            System.out.println("              05 - Maio                 ");
            System.out.println("              06 - Junho                ");
            System.out.println("              07 - Julho                ");
            System.out.println("              08 - Agosto               ");
            System.out.println("              09 - Setembro             ");
            System.out.println("              10 - Outubro              ");
            System.out.println("              11 - Novembro             ");
            System.out.println("              12 - Desembro             ");
            System.out.println("----------------------------------------");
            
            System.out.println("Informe o Mês:");
            meses = mes.nextInt();
            System.out.println("----------------------------------------");
            
        if(meses == 1){
            System.out.println("Janeiro tem " + Jan); 
            int numero1 = Jan;
         System.out.println("----------------------------------------");
         System.out.println("Calendario de Janeiro");
         while(numero1 >= 1){
            System.out.println("----------------------------------------");
            System.out.println(numero1);
            numero1 = numero1 -1;}
            
        }if(meses == 2){
            System.out.println("Fevereiro tem " + Fev);
                int numero2 = Fev;
         System.out.println("----------------------------------------");
         System.out.println("Calendario de Fevereiro");
         while(numero2 >= 1){
            System.out.println("----------------------------------------");
            System.out.println(numero2);
            numero2 = numero2 -1;}
            
        }if(meses == 3){
            System.out.println("Março tem " + Mar);
                int numero3 = Mar;
         System.out.println("----------------------------------------");
         System.out.println("Calendario de Março");
         while(numero3 >= 1){
            System.out.println("----------------------------------------");
            System.out.println(numero3);
            numero3 = numero3 -1;}
            
        }if(meses == 4){
            System.out.println("Abril tem " + Abr);
                int numero4 = Abr;
         System.out.println("----------------------------------------");
         System.out.println("Calendario de Abril");
         while(numero4 >= 1){
            System.out.println("----------------------------------------");
            System.out.println(numero4);
            numero4 = numero4 -1;}
            
        }if(meses == 5){
            System.out.println("Maio tem " + Mai);
                int numero5 = Mai;
         System.out.println("----------------------------------------");
         System.out.println("Calendario de Maio");
         while(numero5 >= 1){
            System.out.println("----------------------------------------");
            System.out.println(numero5);
            numero5 = numero5 -1;}
            
        }if(meses == 6){
            System.out.println("Junho tem " + Jun);
                int numero6 = Jun;
         System.out.println("----------------------------------------");
         System.out.println("Calendario de Junho");
         while(numero6 >= 1){
            System.out.println("----------------------------------------");
            System.out.println(numero6);
            numero6 = numero6 -1;}
            
        }if(meses == 7){
            System.out.println("Julho tem " + Jul);
                int numero7 = Jul;
         System.out.println("----------------------------------------");
         System.out.println("Calendario de Julho");
         while(numero7 >= 1){
            System.out.println("----------------------------------------");
            System.out.println(numero7);
            numero7 = numero7 -1;}
            
        }if(meses == 8){
            System.out.println("agosto tem " + Ago);
                int numero8 = Ago;
         System.out.println("----------------------------------------");
         System.out.println("Calendario de Agosto");
         while(numero8 >= 1){
            System.out.println("----------------------------------------");
            System.out.println(numero8);
            numero8 = numero8 -1;}
            
        }if(meses == 9){
            System.out.println("Setembro tem " + Set);
                int numero9 = Set;
         System.out.println("----------------------------------------");
         System.out.println("Calendario de Setembro");
         while(numero9 >= 1){
            System.out.println("----------------------------------------");
            System.out.println(numero9);
            numero9 = numero9 -1;}
            
        }if(meses == 10){
            System.out.println("Outubro tem " + Out);
                int numero10 = Out;
         System.out.println("----------------------------------------");
         System.out.println("Calendario de Outubro");
         while(numero10 >= 1){
            System.out.println("----------------------------------------");
            System.out.println(numero10);
            numero10 = numero10 -1;}
            
        }if(meses == 11){
            System.out.println("Novembro tem " + Nov);
                int numero11 = Nov;
         System.out.println("----------------------------------------");
         System.out.println("Calendario de Novembro");
         while(numero11 >= 1){
            System.out.println("----------------------------------------");
            System.out.println(numero11);
            numero11 = numero11 -1;}
            
        }if(meses == 12){
            System.out.println("Desembro tem " + Dez);
                int numero12 = Dez;
         System.out.println("----------------------------------------");
         System.out.println("Calendario de Dezembro");
         while(numero12 >= 1){
            System.out.println("----------------------------------------");
            System.out.println(numero12);
            numero12 = numero12 -1;}
         
        }
                
    }
    
}
        