package com.mini_teste;

import java.util.Scanner;

public class Ex5_Cond {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Informe o código do item: ");
	        int codigo = sc.nextInt();

	        System.out.println("Informe a quantidade: ");
	        int quantidade = sc.nextInt();
	        
	        double valor_item = 0;

	        switch (codigo) {
	        case 1:
	        	valor_item = 4.00;
	        	break;
	        case 2:
	        	valor_item = 4.50;
	        	break;
	        case 3:
	        	valor_item = 5.00;
	        	break;
	        case 4:
	        	valor_item = 2.00;
	        	break;
	        case 5:
	        	valor_item = 1.50;
	        	break;
	        default:
	        	System.out.println("Código inválido");
	        	break;
	        }


	        double valor_total = valor_item * quantidade;
	        double valor_imposto = 0;

	        if (valor_total > 4500) {
	        	valor_imposto = valor_total * 0.28;
	        } else if (valor_total > 3000) {
	        	valor_imposto = valor_total * 0.18;
	        } else if (valor_total > 2000) {
	        	valor_imposto = valor_total * 0.08;
	        }

	        double valor_final = valor_total + valor_imposto;

	        System.out.printf("Valor final a pagar:  %.2f", valor_final," %.2f MZ");




	}

}
