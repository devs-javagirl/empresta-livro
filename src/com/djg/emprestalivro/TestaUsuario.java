package com.djg.emprestalivro;

import java.util.Scanner;

import com.djg.emprestalivro.dominio.Emprestimo;
import com.djg.emprestalivro.dominio.Livro;
import com.djg.emprestalivro.dominio.Usuario;

public class TestaUsuario {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

// ----------------------------------------------   Para testar a criação do usuário

		System.out.println("Digite seu nome Completo: ");
		String nome = scanner.nextLine();

		System.out.println("Digite sua data de Nascimento: ");
		String dataNascimento = scanner.nextLine();

		System.out.println("Digite seu endereço: ");
		String endereco = scanner.nextLine();

		Usuario usuario = new Usuario(1l, nome, dataNascimento, endereco);

		usuario.imprimeUsuario();


// ----------------------------------------------   Para testar a criação do livro

		System.out.println("\n\n\nDigite o nome do livro: ");
		String nomeLivro = scanner.nextLine();

		System.out.println("Digite o nome do autor do livro: ");
		String autorLivro = scanner.nextLine();

		Livro livro = new Livro(1l, nomeLivro, autorLivro);
		livro.imprimeLivro();


// ----------------------------------------------   Para testar o emprestimo

		System.out.println("\n\n\nDigite a data do empréstimo: ");
		String dataEmprestimo = scanner.nextLine();

		System.out.println("Digite a data da devolução: ");
		String dataDevolucao = scanner.nextLine();

		Emprestimo emprestimo = new Emprestimo(1L, usuario, livro, dataEmprestimo, dataDevolucao);
		emprestimo.imprimeEmprestimo();
	}

}
