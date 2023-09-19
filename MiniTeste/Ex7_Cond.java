package com.mini_teste;

import java.util.Scanner;

public class Ex7_Cond {

	public static void main(String[] args) {
		double ImpostoDeRenda;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o salário: ");
		double salario=sc.nextDouble();
		
		if(salario <=2000) {
			ImpostoDeRenda=0;
		}else if(salario <= 3000) {
			ImpostoDeRenda=salario * 0.08;
		}else if(salario <= 4500) {
			ImpostoDeRenda = salario * 0.18;
		}else {
			ImpostoDeRenda= salario * 0.28;
		}
		
		System.out.println("O valor de Imposto de renda é: "+ImpostoDeRenda+ " MZ");
	}

}
