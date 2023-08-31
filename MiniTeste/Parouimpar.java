/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parouimpar;

/**
 *
 * @author James
 */
import java.util.Scanner;
public class Parouimpar {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("BEM VINDO AO SISTEMA DE VERIFICAÇÃO DE NUMERO PAR/IMPAR");
        System.out.println("DIGITA O NUMERO");
        int num = sc.nextInt();
        if (num%2==1) {
            System.out.println("Valor impar");
            
        }
        System.out.println("Valor Par");
        
        
        
    }
}
