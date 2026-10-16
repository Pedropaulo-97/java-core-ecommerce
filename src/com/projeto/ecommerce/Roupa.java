package com.projeto.ecommerce;


import java.math.BigDecimal;

public class Roupa extends Produto implements Avaliavel {

    private String tamanho;

    public Roupa(String marca, String modelo, BigDecimal preco, int quantidadeEstoque, String tamanho) {
        super(marca, modelo, preco, quantidadeEstoque);
        setTamanho(tamanho);
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        if (tamanho == null || tamanho.isBlank()) {
            System.out.println("Erro: Tamanho nulo.");
            return;
        }
        this.tamanho = tamanho;
    }


    @Override
    public String descricao() {
        return "Produto: " + getMarca() + " - " + getModelo() + " - " + getPreco() + " - " + getQuantidadeEstoque() + " - " + getTamanho();
    }

    @Override
    public void avaliar(int nota) {
        System.out.println(getMarca() + " " + getModelo() + " foi avaliado com nota: " + nota);
    }
}