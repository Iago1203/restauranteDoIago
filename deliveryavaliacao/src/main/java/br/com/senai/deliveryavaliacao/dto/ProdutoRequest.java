package br.com.senai.deliveryavaliacao.dto;

import java.math.BigDecimal;

public class ProdutoRequest {
    private Integer id;

    public ProdutoRequest() {
    }

    public Integer getRestauranteId() {
        return id;
    }

    public void setRestauranteId(Integer id) {
        this.id = id;
    }

    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    BigDecimal preco;

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
