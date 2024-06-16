package com.example.loja_online;

import android.content.Intent;

public class Produto {

    private String nomeProduto;
    private String descricaoProduto;
    private Double precoUnitario;
    private Integer idProduto;
    private Integer quantidade;

    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

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

    public Integer getIdProduto(){

        return idProduto;
    }

    public void setIdProduto(Integer idProduto){

        this.idProduto = idProduto;

    }

    @Override
    public String toString() {
        return "Nome do produto: " + nomeProduto +
                ", Descrição do produto: " + descricaoProduto +
                ", Preço Unitário: R$ " + precoUnitario + ", Quantidade em estoque: " + quantidade;
    }

    public Produto(String nomeProduto, String descricaoProduto, Double precoUnitario, Integer idProduto, Integer quantidade, String imageUrl) {
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.precoUnitario = precoUnitario;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.imageUrl = imageUrl;
    }
}
