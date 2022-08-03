package br.com.tech4me.primeirorest.compartilhado;

import java.util.List;

public class ProdutoDto {
    private String id;
    private String nome;
    private double preco;
    private int quantidade;

    //#region Get / Set

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setVenda(List<Venda> obterVenda) {
    }

}
