package br.com.senai.deliveryavaliacao.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "produto")

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull 
    @NotBlank (message = "Informe o nome do produto")
    private String nome;

    @NotNull 
    @NotBlank (message = "O peço deve ser maior que zero")
    private BigDecimal preco;

    @ManyToOne
    @JoinColumn(name = "restaurante_id", nullable = false)
    @NotBlank (message = "Informe o restaurante")
    private Restaurante restaurante;

    public Produto() {
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Restaurante getRestauranteId() {
        return restaurante;
    }

    public void setRestauranteId(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

}
