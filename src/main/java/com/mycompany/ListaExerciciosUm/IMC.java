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
public class IMC {
    public static void main(String args[]){
        Scanner imc = new Scanner(System.in);

        
        float genero, idade, peso, altura, IMC, dados;
        
        System.out.println("----------------------------------------");
        System.out.println("Qual é o seu Peso? ");
        peso = imc.nextFloat();
        System.out.println("----------------------------------------");
        System.out.println("Qual é a sua Altura? ");
        altura = imc.nextFloat();
        System.out.println("----------------------------------------");
        System.out.println("Qual é a clasificação desejada? ");
        dados = imc.nextFloat();
        System.out.println("----------------------------------------");
        
        IMC = peso/(altura*altura);
        
        if (IMC < dados){
            System.out.println("Opaciente com o peso " + peso + " e a altura " + altura + " o seu IMC é: " + IMC + " esta Normal."); 
        }else if(IMC > dados){
            System.out.println("----------------------------------------");
            System.out.println("Opaciente com o peso " + peso + " e a altura " + altura + " o seu IMC é: " + IMC + " esta Obeso.");
            System.out.println("----------------------------------------");
        }

    }
}
