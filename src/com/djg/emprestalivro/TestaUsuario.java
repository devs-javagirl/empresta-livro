package com.djg.emprestalivro;

import java.util.Scanner;

import com.djg.emprestalivro.dominio.Livro;
import com.djg.emprestalivro.dominio.Usuario;

public class TestaUsuario {

	public static void main(String[] args) {

// ----------------------------------------------   Para testar a cria��o do usu�rio

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite seu nome Completo: ");
		String nome = scanner.nextLine();

		System.out.println("Digite sua data de Nascimento: ");
		String dataNascimento = scanner.nextLine();

		System.out.println("Digite seu endere�o: ");
		String endereco = scanner.nextLine();

		Usuario usuario = new Usuario(1l, nome, dataNascimento, endereco);

		usuario.imprimeUsuario(usuario);


// ----------------------------------------------   Para testar a cria��o do livro
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Digite o nome do livro: ");
//		String nomeLivro = scanner.nextLine();
//
//		System.out.println("Digite o nome do autor do livro: ");
//		String autorLivro = scanner.nextLine();
//
//		Livro livro = new Livro(1l, nomeLivro, autorLivro);
//		livro.imprimeLivro();

	}

}
