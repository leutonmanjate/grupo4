package com.mini_teste;

import java.util.Scanner;

public class Ex3_Cond {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entra com o valor de A: ");
		int A = sc.nextInt();
		
		System.out.println("Entra com o valor de B: ");
		int B = sc.nextInt();
		
		if(A % B == 0 || B % A==0) {
			System.out.println("São Multiplos");
		}else {
			System.out.println("Não são Multiplos");
		}
	}

}
