package com.projeto.ecommerce;

public class Tenis extends Produto implements Avaliavel {

    private int numeracao;

    public Tenis(String marca, String modelo, double preco, int quantidadeEstoque, int numeracao) {
        super(marca, modelo, preco, quantidadeEstoque);
        setNumeracao(numeracao);
    }

    public int getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(int numeracao) {
        if (numeracao <= 0 || numeracao > 60) {
            System.out.println("Erro: Numeração não permitida");
            return;
        }
        this.numeracao = numeracao;
    }

    @Override
    public String descricao() {
        return "Produto: " + getMarca() + " - " + getModelo() + " - " + getPreco() + " - " + getQuantidadeEstoque() + " - " + getNumeracao();
    }

    @Override
    public void avaliar(int nota) {
        System.out.println(getMarca() + " " + getModelo() + " foi avaliado com nota: " + nota);
    }
}