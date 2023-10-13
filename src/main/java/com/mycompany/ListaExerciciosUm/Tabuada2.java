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
public class Tabuada2 {
    public static void main(String args[]){
        Scanner tabuada2 = new Scanner(System.in);
        
       int dig = 0, mul = 0, resultado = 0, cont =1;
       
       System.out.println("-----------------------------------------");
       System.out.println("       Informe o Numero da Tabuada:      ");
       dig = tabuada2.nextInt();
       System.out.println("-----------------------------------------");
       System.out.println("    Informe o numero de multiplicação    ");
       mul = tabuada2.nextInt();
       System.out.println("-----------------------------------------");
       
       while (cont <= mul){
           resultado = dig * cont;
           System.out.println(   dig + " x " + cont + " = " + resultado   );
           
           cont = cont + 1;
       }
    }
}
