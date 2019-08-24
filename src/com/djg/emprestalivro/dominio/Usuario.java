package com.djg.emprestalivro.dominio;

public class Usuario {
	
	private Long codigo;
	private String nomeCompleto;
	private String dataNascimento;
	private String endereco;
	
	public Usuario(Long codigo, String nomeCompleto, String dataNascimento, String endereco) {
		this.codigo = codigo;
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void imprimeUsuario() {
		
		System.out.println("Código: " + this.getCodigo());
		System.out.println("Nome Completo: " + this.getNomeCompleto());
		System.out.println("Data de Nascimento: " + this.getDataNascimento());
		System.out.println("Endereço: " + this.getEndereco());
		
	}
}