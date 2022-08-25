package com.aulaIBM.projeto;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
		Scanner teclado = new Scanner(System.in);
		String nome;
		for (int count = 0; count < 5; count++) {
			System.out.println("Digite o nome:");
			nome = teclado.nextLine();
			System.out.println(nome);
		}

	}
}
