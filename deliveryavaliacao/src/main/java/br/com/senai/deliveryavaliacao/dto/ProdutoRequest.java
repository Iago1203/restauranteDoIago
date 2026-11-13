package br.com.senai.deliveryavaliacao.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProdutoRequest {
    private Integer restauranteId;

    public ProdutoRequest() {
    }
    @NotNull (message = "Informe o restaurante")
    public Integer getRestauranteId() {
        return restauranteId;
    }

    public void setRestauranteId(Integer restauranteId) {
        this.restauranteId = restauranteId;
    }
  
    @NotBlank (message = "Informe o nome do produto")
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
 @NotNull (message = "O preço tem que ser maior que zero") 
    
    BigDecimal preco;

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }   

    
}

