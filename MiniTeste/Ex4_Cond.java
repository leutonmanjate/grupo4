package com.mini_teste;

import java.util.Scanner;

public class Ex4_Cond {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita a hora inicial do Jogo: ");
		int horaInicial=sc.nextInt();
		
		System.out.println("Digita a hora final do Jogo: ");
		int horaFinal= sc.nextInt();
		
		if(horaFinal < horaInicial) {
			horaFinal += 24;
			
		}
		
		int duracao =horaFinal - horaInicial;
		if(duracao <1) {
			duracao = 1;
		}else if(duracao > 24) {
			duracao = 24;
		}
		System.out.println("A duração do jogo foi: "+duracao+" horas.");
	}

}
