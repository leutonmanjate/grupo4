package com.mini_teste;

import java.util.Scanner;

public class Ex5_Seq {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita o codigo da  peça 1:");
		int codPeca1 = sc.nextInt();
		
		System.out.println("Digite o número de peças 1:");
		int qtPeca1 =sc.nextInt();
		
		System.out.println("Digite o valor unitário da primeira peça:");
		int vUnitPeca1=sc.nextInt();
		
		System.out.println("Digite o codigo da peça 2: ");
		int codPeca2 = sc.nextInt();
		
		System.out.println("Digite o número de peças 2: ");
		int qtPeca2 = sc.nextInt();
		
		System.out.println("Digite o valor unitário: ");
		int vUnitPeca2 = sc.nextInt();
		
		double ValorPeca1= qtPeca1*vUnitPeca1;
		double ValorPeca2 = qtPeca2*vUnitPeca2;
		double valorTotal = ValorPeca1 + ValorPeca2;
		
		System.out.printf("O codigo da  peça 1 : "+codPeca1);
		System.out.printf("O numero de peças 1: "+qtPeca1);
		System.out.println("O valor unitário da peça 1: "+vUnitPeca1+" MZ");
		
		System.out.println("O codigo da peça 2: "+codPeca2);
		System.out.printf("O numero de peças 2: "+qtPeca2);
		System.out.println("O valor unitário de peças 2: "+vUnitPeca2+" MZ");
		
		System.out.println("O valor total a ser pago: "+valorTotal);
		
		
	}

}
