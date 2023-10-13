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
public class CalculadoraSimples {
    public static void main(String args[]){
        Scanner simples = new Scanner(System.in);
        
        int opcao;
        
        float num1 = 0, num2 = 0, resultado = 0;    
        
        Boolean continuar = true;
        
        String opcaoEscolha;
        
        while(continuar){
            System.out.println("----------------------------------------");
            System.out.println("Calculadora Simples");
            System.out.println("----------------------------------------");
            System.out.println("Selecione a Operação Desejada:");
            System.out.println("----------------------------------------");
            System.out.println("                1 - Soma                ");
            System.out.println("                2 - Divisão             ");
            System.out.println("                3 - Subtração           ");
            System.out.println("                4 - Multiplicação       ");
            System.out.println("----------------------------------------");
            
            opcao = simples.nextInt();
            
            if(opcao == 1){
                System.out.println("Informe o Primeiro Numero:");
                num1 = simples.nextInt();
                System.out.println("----------------------------------------");
                System.out.println("Infome o Segundo Numero:");
                num2 = simples.nextInt();
                System.out.println("----------------------------------------");
                
                resultado = num1 + num2;
                
                System.out.println("Escolheu Soma");
                System.out.println("----------------------------------------");
                System.out.println("RESULTADO");
                System.out.println("----------------------------------------");
                System.out.println(resultado);
                System.out.println("----------------------------------------");
            }else if(opcao == 2){
                System.out.println("Informe o Primeiro Numero:");
                num1 = simples.nextInt();
                System.out.println("----------------------------------------");
                System.out.println("Infome o Segundo Numero:");
                num2 = simples.nextInt();
                System.out.println("----------------------------------------");
                
                resultado = num1 / num2;
                
                System.out.println("Escolheu Divisão");
                System.out.println("----------------------------------------");
                System.out.println("RESULTADO");
                System.out.println("----------------------------------------");
                System.out.println(resultado);
                System.out.println("----------------------------------------");
            }else if(opcao == 3){
                System.out.println("Informe o Primeiro Numero:");
                num1 = simples.nextInt();
                System.out.println("----------------------------------------");
                System.out.println("Infome o Segundo Numero:");
                num2 = simples.nextInt();
                System.out.println("----------------------------------------");
                
                resultado = num1 - num2;
                
                System.out.println("Escolheu Subtração");
                System.out.println("----------------------------------------");
                System.out.println("RESULTADO");
                System.out.println("----------------------------------------");
                System.out.println(resultado);
                System.out.println("----------------------------------------");
            }else if(opcao == 4){
                System.out.println("Informe o Primeiro Numero:");
                num1 = simples.nextInt();
                System.out.println("----------------------------------------");
                System.out.println("Infome o Segundo Numero:");
                num2 = simples.nextInt();
                System.out.println("----------------------------------------");
                
                resultado = num1 * num2;
                
                System.out.println("Escolheu Multiplicação");
                System.out.println("----------------------------------------");
                System.out.println("RESULTADO");
                System.out.println("----------------------------------------");
                System.out.println(resultado);
                System.out.println("----------------------------------------");
            }else{
                System.out.println("----------------------------------------");
                System.err.println("            OPÇÃO INEXISTENTE!          ");
                System.out.println("----------------------------------------");  
            }
        {
                System.out.println("----------------------------------------");
                System.out.println("Dejesa Realizar Mais Alguma Operação:");
                System.out.println("            ( Sim / Não )            ");
                opcaoEscolha = simples.next();
                
                if(opcaoEscolha.equals("Sim")){
                    continuar = true;
                }else{
                    continuar = false;
                }
                    
            }
        
        }
         
    }
    
}
