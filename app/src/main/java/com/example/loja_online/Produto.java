package com.example.loja_online;

import android.content.Intent;

public class Produto {

    private String nomeProduto;
    private String descricaoProduto;
    private Double precoUnitario;
    private Integer idProduto;


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
        return "Produto{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", descricaoProduto='" + descricaoProduto + '\'' +
                ", precoUnitario=" + precoUnitario +
                '}';
    }

    public Produto(String nomeProduto, String descricaoProduto, Double precoUnitario, Integer idProduto) {
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.precoUnitario = precoUnitario;
        this.idProduto = idProduto;
    }
}