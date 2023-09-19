package com.mini_teste;

import java.util.Scanner;

public class Ex2_Seq {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o numero do circulo: ");
		double raio= sc.nextDouble();
		
		double area = 3.14159 * Math.pow(raio, 2);
		
		System.out.printf("A area do circulo é %.4f", area);
	
		
	}

}
