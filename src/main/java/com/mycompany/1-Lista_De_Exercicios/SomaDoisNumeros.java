/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioavaliativo;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class SomaDoisNumeros {
    public static void main(String args[]){
        Scanner Soma = new Scanner(System.in);
        
        int num1 =0, num2 = 0, resultado = 0;
        
        System.err.println("---------------------------");
        System.out.println("Informe o Primeiro Numero: ");
        num1 = Soma.nextInt();
        System.err.println("---------------------------");
        System.out.println("Informe o Segundo Numero: ");
        num2 = Soma.nextInt();
        System.err.println("---------------------------");
        resultado = num1 + num2;
         System.err.println("O resulatado da Soma entre " + num1 +" e " + num2 + " é: " + resultado);
        
        
    }
}
