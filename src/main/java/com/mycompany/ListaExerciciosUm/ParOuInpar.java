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
public class ParOuInpar {
    public static void main(String args[]){
        Scanner parinpar = new Scanner(System.in);
        
        int num1, resultado;
        
        System.err.println("-----------------------------------");
        System.out.println("Informe o Primeiro Numero Inteiro: ");
        num1 = parinpar.nextInt();
        System.err.println("-----------------------------------");
        
        resultado = num1 % 2;
        
        System.out.println(resultado);
        
        if(resultado == 0){
            System.out.println("O numero " + num1 + " é Par");
        }else{
            System.out.println("O numero " + num1 + " é Inpar");
        }
    }
}
