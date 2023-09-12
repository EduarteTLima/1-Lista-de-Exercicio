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
public class TrocaDeVariavel {
    public static void main(String args[]){
        Scanner trocavariavel = new Scanner(System.in);
        
        int saldo, divida, poupança;
        
            System.out.println("-----------------------------------------");
            System.out.println("Informe o Valor do Saldo: ");
            saldo = trocavariavel.nextInt();
            System.out.println("-----------------------------------------");
            System.out.println("Informe o Valor da Divida:");
            divida = trocavariavel.nextInt();
            System.out.println("-----------------------------------------");
            
            System.out.println("                                         ");
            System.out.println("-----------------------------------------");
            System.out.println("Antes de Realizar a Troca os Valores São:");
            System.out.println("-----------------------------------------");
            System.out.println("Temos no Saldo o Valor: " + saldo);
            System.out.println("-----------------------------------------");
            System.out.println("Temos uma Divida no Valor: " + divida);
            System.out.println("-----------------------------------------");
            
            poupança = saldo;
            saldo = divida;
            divida = poupança;
            
            System.out.println("                                         ");
            System.out.println("-----------------------------------------");
            System.out.println("Depopis da Troca os Valores São:");
            System.out.println("-----------------------------------------");
            System.out.println("Temos no Saldo o Valor: " + saldo);
            System.out.println("-----------------------------------------");
            System.out.println("Temos uma Divida no Valor: " + divida);
    }
}
