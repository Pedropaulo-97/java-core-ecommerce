package com.projeto.ecommerce;


import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Produto[] produtos = new Produto[4];

        produtos[0] = new Tenis("Nike", "Air Jordan", new BigDecimal("1299.99"), 10, 42);
        produtos[1] = new Tenis("Adidas", "ADI2000", new BigDecimal("799.99"), 0, 39);
        produtos[2] = new Roupa("Nike", "Camisa NOC", new BigDecimal("299.99"), 10, "M");
        produtos[3] = new Roupa("Adidas", "Camisa Dry", new BigDecimal("199.99"), 2, "GG");

        int totalEstoque = 0;

        for (Produto p : produtos) {
            System.out.println(p.descricao());
            System.out.println("Produto Esgotado: " + p.esgotado());
            System.out.println("Ultimas Unidades: " + p.ultimasUnidades());

            totalEstoque += p.getQuantidadeEstoque();

            if (p instanceof Avaliavel avaliavel) {
                avaliavel.avaliar(5);
            }
        }

        System.out.println("Frete SUL: " + produtos[0].calcularFrete("SUL"));

        System.out.println("Frete CENTRO-OESTE: " + produtos[0].calcularFrete("CENTRO-OESTE"));

        System.out.println("Frete NORDESTE: " + produtos[0].calcularFrete("NORDESTE"));

        System.out.println("Frete EXTERIOR: " + produtos[0].calcularFrete("EXTERIOR"));

        double mediaEstoque = (double) totalEstoque / produtos.length;
        System.out.println("Média de Estoque: " + mediaEstoque);

        produtos[1].adicionarEstoque(8);
        System.out.println("Estoque ADI2000: " + produtos[1].getQuantidadeEstoque());

        produtos[3].registrarVenda(2);
        System.out.println("Estoque Camisa Dry: " + produtos[3].getQuantidadeEstoque());

        produtos[0].imprimirParcelas(4);
    }
}