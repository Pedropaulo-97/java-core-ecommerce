package com.projeto.ecommerce;


public class Main {
    public static void main(String[] args) {

        Produto[] produtos = new Produto[4];

        produtos[0] = new Tenis("Nike", "Air Jordan", 1299.99, 10, 42);
        produtos[1] = new Tenis("Adidas", "ADI2000", 799.99, 0, 39);
        produtos[2] = new Roupa("Nike", "Camisa NOC", 299.99, 10, "M");
        produtos[3] = new Roupa("Adidas", "Camisa Dry", 199.99, 2, "GG");

        for (Produto p : produtos) {
            System.out.println(p.descricao());
            System.out.println("Produto Esgotado: " + p.esgotado());
            System.out.println("Ultimas Unidades: " + p.ultimasUnidades());

            if (p instanceof Avaliavel avaliavel) {
                avaliavel.avaliar(5);
            }
        }
    }
}