package com.mini_teste;

import java.util.Scanner;

public class Ex3_Seq {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os valores de A, B, C, D: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int difer= (a*b-c*d);
		System.out.println("O resultado da diferença é: "+difer);
	}

}
