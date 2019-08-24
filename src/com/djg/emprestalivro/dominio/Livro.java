package com.djg.emprestalivro.dominio;

public class Livro {
	
		private Long codigo;
		private String nome;
		private String autor;
		
		public Livro(Long codigo, String nome, String autor) {
			this.codigo = codigo;
			this.nome = nome;
			this.autor = autor;
		}

		public Long getCodigo() {
			return codigo;
		}

		public void setCodigo(Long codigo) {
			this.codigo = codigo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public void imprimeLivro(){
			System.out.println("Código: " + this.getCodigo());
			System.out.println("Nome do Livro: " + this.getNome());
			System.out.println("Autor: " + this.getAutor());
		}
}
