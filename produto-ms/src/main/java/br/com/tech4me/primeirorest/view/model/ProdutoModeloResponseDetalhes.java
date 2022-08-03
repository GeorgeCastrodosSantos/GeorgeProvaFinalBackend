package br.com.tech4me.primeirorest.view.model;

import java.util.List;

import br.com.tech4me.primeirorest.compartilhado.Venda;

public class ProdutoModeloResponseDetalhes {
    private String id;
    private String nome;
    private double preco;
    private int quantidade;

    private List<Venda> vendas;
    
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
    
    public List<Venda> getVenda() {
        return vendas;
    }
    public void setVenda(List<Venda> vendas) {
        this.vendas = vendas;
    }
}
