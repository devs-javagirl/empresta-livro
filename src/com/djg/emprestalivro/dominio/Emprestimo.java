package com.djg.emprestalivro.dominio;

public class Emprestimo {

    private Long codigo;

    private Usuario usuario;

    private Livro livro;

    private String dataEmprestimo;

    private String dataDevolucao;


    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void imprimeEmprestimo(){
        String mostra = "Emprestimo{" +
            "codigo=" + codigo +
                    ", usuario=" + usuario +
                    ", livro=" + livro +
                    ", dataEmprestimo='" + dataEmprestimo + '\'' +
                    ", dataDevolucao='" + dataDevolucao + '\'' +
                    '}';

        System.out.println(mostra);
    }
}
