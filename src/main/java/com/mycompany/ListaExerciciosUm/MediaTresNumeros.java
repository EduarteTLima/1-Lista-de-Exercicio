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
public class MediaTresNumeros {
    public static void main(String args[]){
        Scanner media = new Scanner(System.in);
        
        int num1, num2, num3, resultado;
        
        System.out.println("Informe o Primeiro Numero:");
        num1 = media.nextInt();
        System.out .println("---------------------------");
        System.out.println("Informe o Segundo Numero:");
        num2 = media.nextInt();
        System.out.println("---------------------------");
        System.out.println("Informe o Terceiro Numero:");
        num3 = media.nextInt();
        System.out.println("---------------------------");
        
        resultado = (num1 + num2 + num3)/3;
        
        System.out.println("O Resultado da Media entre o " + num1 + " o " + num2 + " e o " + num3 + " é: " + resultado);
              
    }
    
}
