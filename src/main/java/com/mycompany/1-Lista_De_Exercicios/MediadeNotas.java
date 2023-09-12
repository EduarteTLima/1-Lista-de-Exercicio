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
public class MediadeNotas {
    public static void main(String args[]){
        Scanner media = new Scanner(System.in);
        
        float nota1, nota2, Media, media1;
        
        System.out.println("-----------------------------------------");
        System.out.println("Informe a Nota do Primeiro Semestre:");
        nota1 = media.nextFloat();
        System.out.println("-----------------------------------------");
        System.out.println("Informe a Nota do Segundo Semestre:");
        nota2 = media.nextFloat();
        System.out.println("-----------------------------------------");
        System.out.println("Informe a Media:");
        Media = media.nextFloat();
        System.out.println("-----------------------------------------");
        
        media1 = (nota1 + nota2)/2;
        
        if(media1 >= Media){
            System.out.println(" Media " + media1 + " aprovado ");
        }else{
            System.out.println(" Media " + media1 + " reprovado ");
        }
                
    }
    
}
