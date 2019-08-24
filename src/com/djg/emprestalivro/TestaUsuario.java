package com.djg.emprestalivro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.djg.emprestalivro.dominio.Emprestimo;
import com.djg.emprestalivro.dominio.Livro;
import com.djg.emprestalivro.dominio.Usuario;

public class TestaUsuario {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

// ----------------------------------------------   Para testar a cria��o do usu�rio

		System.out.println("Digite seu nome Completo: ");
		String nome = scanner.nextLine();

		System.out.println("Digite sua data de Nascimento: ");
		String dataNascimento = scanner.nextLine();

		System.out.println("Digite seu endere�o: ");
		String endereco = scanner.nextLine();

		Usuario usuario = new Usuario(1l, nome, dataNascimento, endereco);

		usuario.imprimeUsuario();


// ----------------------------------------------   Para testar a cria��o do livro

		System.out.println("\n\n\nDigite o nome do livro: ");
		String nomeLivro = scanner.nextLine();

		System.out.println("Digite o nome do autor do livro: ");
		String autorLivro = scanner.nextLine();

		Livro livro = new Livro(1l, nomeLivro, autorLivro);
		livro.imprimeLivro();


// ----------------------------------------------   Para testar o emprestimo sem a regra de neg�cio implementada

		System.out.println("\n\n\nDigite a data do empr�stimo: ");
		String dataEmprestimo = scanner.nextLine();

		System.out.println("Digite a data da devolu��o: ");
		String dataDevolucao = scanner.nextLine();

		Emprestimo emprestimo = new Emprestimo(1L, usuario, livro, dataEmprestimo, dataDevolucao);
		emprestimo.imprimeEmprestimo();

// ----------------------------------------------   Para testar o emprestimo sem a regra de neg�cio implementada

//		String dataEmprestimo = "";
//		String dataDevolucao = "";
//		boolean invalido = true;
//
//		while(invalido) {
//			System.out.println("\n\n\nDigite a data do empr�stimo: ");
//			dataEmprestimo = scanner.nextLine();
//
//			System.out.println("Digite a data da devolu��o: ");
//			dataDevolucao = scanner.nextLine();
//
//			LocalDate localDateEmprestimo = LocalDate.parse(dataEmprestimo, DateTimeFormatter.ISO_DATE);
//			LocalDate localDateDevolucao = LocalDate.parse(dataDevolucao, DateTimeFormatter.ISO_DATE);
//
//			if(localDateDevolucao.isBefore(localDateEmprestimo)){
//				invalido = true;
//				System.out.println("A data da devolu��o deve ser depois da data do empr�stimo");
//			} else {
//				invalido = false;
//			}
//		}
//
//		Emprestimo emprestimo = new Emprestimo(1L, usuario, livro, dataEmprestimo, dataDevolucao);
//		emprestimo.imprimeEmprestimo();
	}

}
