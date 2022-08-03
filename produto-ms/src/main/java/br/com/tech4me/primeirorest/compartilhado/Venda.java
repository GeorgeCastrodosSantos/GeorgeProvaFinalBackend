package br.com.tech4me.primeirorest.compartilhado;

public class Venda {
    private String id;
    private Integer quantVenda;
    private String nome;
    private double valorTotal;

    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Integer getQuantVenda() {
        return quantVenda;
    }
    public void setQuantVenda(Integer quantVenda) {
        this.quantVenda = quantVenda;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}