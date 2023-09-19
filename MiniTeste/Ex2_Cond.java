package com.mini_teste;

import java.util.Scanner;

public class Ex2_Cond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----- PAR OU IMPAR-------");
		System.out.println("Digite um numero:");
		int n = sc.nextInt();
		if(n %2==0) {
			System.out.println("Este numero é par");
		}else if(n %2==1) {
			System.out.println("Este numero é impar");
		}
	}

}
