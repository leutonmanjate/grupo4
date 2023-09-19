package com.mini_teste;

import java.util.Scanner;

public class Ex4_Seq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nFuncionario , hTrabalhadas;
		double vHora, salario;
		
		System.out.println("Dogite o numero do funcionário: ");
		nFuncionario = sc.nextInt();
		
		System.out.println("Digite o número de horas trabalhadas: ");
		vHora=sc.nextDouble();
		
		System.out.println("Digite o valor que recebe por hora:");
		hTrabalhadas = sc.nextInt();
		
		salario = hTrabalhadas*vHora;
		
		System.out.printf("O número do funcionário %d%n",nFuncionario);
		System.out.println("O salário que recebe: "+salario+" MZ");
		
		
	}

}
