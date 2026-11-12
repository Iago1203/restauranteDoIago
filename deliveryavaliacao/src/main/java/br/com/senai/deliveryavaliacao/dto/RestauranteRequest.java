package br.com.senai.deliveryavaliacao.dto;

;

public class RestauranteRequest {
    private Integer id;


    public RestauranteRequest() {
    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    String endereco;
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    


}
