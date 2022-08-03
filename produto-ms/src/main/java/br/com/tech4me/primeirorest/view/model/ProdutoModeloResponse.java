package br.com.tech4me.primeirorest.view.model;


import java.util.List;

public class ProdutoModeloResponse {

    private String id;
    private String nome;
    private double preco;
    private int quantidade;
    private int VendaTotal= 0;
    VendaTotal = (VendaTotal * preco);

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

    private List<Venda> venda;

       
    public String getVendaTotal() {
        return String.format("%d", VendaTotal);
    }
}
