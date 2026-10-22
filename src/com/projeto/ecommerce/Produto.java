package com.projeto.ecommerce;

import java.math.BigDecimal;
import java.math.RoundingMode;


public abstract class Produto {

    private String marca;
    private String modelo;
    private BigDecimal preco;
    private int quantidadeEstoque;


    public Produto(String marca, String modelo, BigDecimal preco, int quantidadeEstoque) {
        setMarca(marca);
        setModelo(modelo);
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    public Produto(String marca, String modelo) {
        this(marca, modelo, new BigDecimal("0.01"), 0);
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


    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        if (preco.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Erro: Preço não pode ser zero ou negativo");
            return;
        }
        this.preco = preco.setScale(2, RoundingMode.HALF_UP);
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

    public boolean esgotado() {
        return quantidadeEstoque == 0;
    }

    public boolean ultimasUnidades() {
        return quantidadeEstoque >= 1 && quantidadeEstoque <= 3;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida");
        } else {
            quantidadeEstoque += quantidade;
        }
    }

    public void registrarVenda(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Venda inválida: Quantidade deve ser maior que 0");
        } else if (quantidade > quantidadeEstoque) {
            System.out.println("Venda inválida: Estoque insuficiente");
        } else {
            quantidadeEstoque -= quantidade;
        }
    }

    public BigDecimal calcularFrete(String regiao) {
        return switch (regiao) {
            case "SUL", "SUDESTE" -> new BigDecimal("15.00");
            case "CENTRO-OESTE" -> new BigDecimal("25.00");
            case "NORDESTE", "NORTE" -> new BigDecimal("35.00");
            default -> new BigDecimal("40.00");
        };
    }

    public void imprimirParcelas(int numeroParcelas) {
        if (numeroParcelas <= 0) {
            System.out.println("Número de parcelas inválido");
            return;
        }
        BigDecimal valorParcela = preco.divide(BigDecimal.valueOf(numeroParcelas), 2, RoundingMode.HALF_UP);
        for (int i = 1; i <= numeroParcelas - 1; i++) {
            System.out.println("Parcela " + i + ": " + valorParcela);
        }
        BigDecimal ultimaParcela = preco.subtract(valorParcela.multiply(BigDecimal.valueOf(numeroParcelas - 1)));
        System.out.println("Parcela " + numeroParcelas + ": " + ultimaParcela);
    }

    public void repor(int lote, int estoqueMinimo) {

        if (lote <= 0) {
            System.out.println("Lote inválido");
            return;
        }
        while (quantidadeEstoque < estoqueMinimo) {
            quantidadeEstoque += lote;
        }
        System.out.println("Estoque reposto: " + quantidadeEstoque);
    }
}