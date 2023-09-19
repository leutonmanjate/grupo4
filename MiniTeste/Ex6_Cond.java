package com.mini_teste;

import java.util.Scanner;

public class Ex6_Cond {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com um valor: ");
		int val =sc.nextInt();
		if(val >=0 && val<=25) {
			System.out.println("O valor esta dentro do intervalo  [0,25].");
		}else if(val >25 && val <=55) {
			System.out.println("O valor esta dentro do intervalo (25,55].");
		}else if(val >50 && val <=75) {
			System.out.println("O valor esta dentro do intervalo  (50, 75].");
		}else if(val > 75 && val <=100) {
			System.out.println("O valor esta dentro do intervalo (75, 100].");
		}else {
			System.out.println("O valor esta fora do intervalo.");
		}
		
	}

}
