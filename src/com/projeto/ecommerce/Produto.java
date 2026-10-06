package com.projeto.ecommerce;


public abstract class Produto {

    private String marca;
    private String modelo;
    private double preco;
    private int quantidadeEstoque;


    public Produto(String marca, String modelo, double preco, int quantidadeEstoque) {
        setMarca(marca);
        setModelo(modelo);
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    public Produto(String marca, String modelo) {
        this(marca, modelo, 0.01, 0);
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("Erro: Preço não pode ser zero ou negativo");
            return;
        }
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque < 0) {
            System.out.println("Erro: Estoque não pode ser negativo");
            return;
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public abstract String descricao();
}