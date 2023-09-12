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
public class MaiorMenor {
    public static void main(String args[]){
        Scanner maiormenor = new Scanner( System.in);
        
        int um, dois;
        
        System.out.println("----------------------------------------");
        System.out.println("       Informe o Primeiro Numero:       ");
        um = maiormenor.nextInt();
        
        System.out.println("----------------------------------------");
        System.out.println("        Informe o segundo numero:       ");
        dois = maiormenor.nextInt();
        System.out.println("----------------------------------------");
        
        if(um > dois){
            System.out.println("O " + um + " é maior do que " + dois);
            
        }else if(um < dois){
            System.out.println("O " + um + " é menor do que " + dois);
        }else{
            System.out.println("O " + um + " é igual ao " + dois);            
        }
        
    }
}
