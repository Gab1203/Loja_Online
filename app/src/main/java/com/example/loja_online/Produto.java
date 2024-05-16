package com.example.loja_online;

public class Produto {

    private String nomeProduto;
    private String descricaoProduto;
    private Double precoUnitario;


    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", descricaoProduto='" + descricaoProduto + '\'' +
                ", precoUnitario=" + precoUnitario +
                '}';
    }

    public Produto(String nomeProduto, String descricaoProduto, Double precoUnitario) {
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.precoUnitario = precoUnitario;
    }
}
