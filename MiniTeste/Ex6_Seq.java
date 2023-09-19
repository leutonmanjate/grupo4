package com.mini_teste;

import java.util.Scanner;

public class Ex6_Seq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor de A: ");
		double A = sc.nextDouble();
		
		System.out.println("Entre com o valor de B: ");
		double B = sc.nextDouble();
		
		System.out.println("Entre com o valor de C: ");
		double C = sc.nextDouble();
		
		double triangulo = (A * C) / 2.0;
		double circulo = 3.14159 * C * C;
		double trapezio = (A + B) / 2.0 * C;
		double quadrado = B * B;
		double retangulo = A * B;

		System.out.println("Triangulo: " + triangulo);
		System.out.println("Circulo: " + circulo);
		System.out.println("Trapezio: " + trapezio);
		System.out.println("Quadrado: " + quadrado);
		System.out.println("Retângulo: " + retangulo);
		
	}

}
