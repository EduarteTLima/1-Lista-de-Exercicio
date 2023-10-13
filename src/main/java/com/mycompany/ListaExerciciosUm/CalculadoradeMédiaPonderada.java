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
public class CalculadoradeMédiaPonderada {
    public static void main(String args[]){
        Scanner ponderada = new Scanner(System.in);
        
        int nota1, nota2, nota3, peso1,  peso2, peso3, Media, media;
            
            System.out.println("----------------------------------------");
            System.out.println("Informe a primeira nota:");
            nota1 = ponderada.nextInt();
            System.out.println("----------------------------------------");
            System.out.println("Informe a primeira peso da nota:");
            peso1 = ponderada.nextInt();
            System.out.println("----------------------------------------");
            System.out.println("Informe a segunda nota:");
            nota2 = ponderada.nextInt();
            System.out.println("----------------------------------------");
            System.out.println("Informe a segundo peso da nota:");
            peso2 = ponderada.nextInt();
            System.out.println("----------------------------------------");
            System.out.println("Informe a terceira nota:");
            nota3 = ponderada.nextInt();
            System.out.println("----------------------------------------");
            System.out.println("Informe a terceiro peso da nota:");
            peso3 = ponderada.nextInt();
            System.out.println("----------------------------------------");
            
            media =(peso1 + peso2 + peso3);
            
            Media = ((nota1 * peso1) + (nota2 + peso2) + (nota3 + peso3)) / media;
            
            System.out.println("----------------------------------------");
            System.out.println("A Media Ponderada é " + Media);
            System.out.println("----------------------------------------");
            
    }
    
}
