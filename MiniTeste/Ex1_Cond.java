package com.mini_teste;

import java.util.Scanner;

public class Ex1_Cond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int n =sc.nextInt();
		if(n<0) {
			System.out.println("O numero é negativo");
		}else {
			System.out.println("O numero não é negativo");
		}
	}

}
