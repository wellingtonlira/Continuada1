package com.example.avaliacao_c1;

public abstract class Produto {

    private String titulo;
    private double preco;

    public Produto(String titulo, double preco) {
        this.titulo = titulo;
        this.preco = preco;

    }

    public abstract double calculaCusto();

    public String getTitulo() {
        return titulo;
    }

    public double getPreco() {
        return preco;
    }

}
