package br.com.tech4me.vendasms.view.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class VendaModeloInclusao {
    @NotBlank(message = "O Venda nao pode ser em branco")
    @NotEmpty(message = "O  Venda nao pode ser vazio")
    private String id;
    private Integer quantVenda;
    private String nome;
    private double valorVenda;

    
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
    public double getValorVenda() {
        return valorVenda;
    }
    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
    

    //#endregion
}
