package com.djg.emprestalivro;

import java.util.Scanner;

import com.djg.emprestalivro.dominio.Usuario;

public class TestaUsuario {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome Completo: ");
		String nome = scanner.nextLine();

		System.out.println("Digite sua data de Nascimento: ");
		String dataNascimento = scanner.nextLine();
		
		System.out.println("Digite seu endereço: ");
		String endereco = scanner.nextLine();
		
		Usuario usuario = new Usuario(1l, nome, dataNascimento, endereco);

		usuario.imprimeUsuario(usuario);
	}

}
