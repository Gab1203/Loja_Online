package com.example.loja_online;

import android.content.Intent;

import java.util.Comparator;

public class Produto {
    //Criação da classe Produto com os respectivos métodos e atributos encapsulados

    private String nomeProduto;
    private String descricaoProduto;
    private Double precoUnitario;
    private Integer idProduto;
    private Integer quantidade;

    private String imageUrl;

    //Comparator que auxilia a filtragem dos produtos: O primeiro para ordem alfabética de A-Z, o segundo de Z-A, terceiro compara o preço do maior para o menor e o quarto, menor para o maior
    public  static Comparator<Produto> produtoComparatorAz = new Comparator<Produto>() {
        @Override
        public int compare(Produto p1, Produto p2) {

            return p1.getNomeProduto().compareTo(p2.getNomeProduto());
        }
    };

    public  static Comparator<Produto> produtoComparatorZa = new Comparator<Produto>() {
        @Override
        public int compare(Produto p1, Produto p2) {

            return p2.getNomeProduto().compareTo(p1.getNomeProduto());
        }
    };

    public  static Comparator<Produto> produtoComparatorPriceAscending = new Comparator<Produto>() {
        @Override
        public int compare(Produto p1, Produto p2) {

            return (int) (p2.getPrecoUnitario() - p1.getPrecoUnitario());
        }
    };

    public  static Comparator<Produto> produtoComparatorPriceDescending = new Comparator<Produto>() {
        @Override
        public int compare(Produto p1, Produto p2) {

            return (int) (p1.getPrecoUnitario() - p2.getPrecoUnitario());
        }
    };


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
