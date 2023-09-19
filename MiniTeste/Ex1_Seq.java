package com.mini_teste;

import java.util.Scanner;

public class Ex1_Seq {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero:");
		int n1 = sc.nextInt();
		
		System.out.println("Entre com o segundo numero: ");
		int n2 = sc.nextInt();
		
		int soma = n1+n2;
		
		System.out.println("A soma dos numeros: "+n1+ " e "+n2+ " é "+ soma);
	}

}
