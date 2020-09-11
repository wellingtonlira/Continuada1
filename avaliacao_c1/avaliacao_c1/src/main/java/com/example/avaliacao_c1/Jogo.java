package com.example.avaliacao_c1;

public class Jogo extends Produto{

    public Jogo(String titulo, double preco) {
        super(titulo, preco);
    }

    @Override
    public double calculaCusto() {
        return getPreco() + 0.10;
    }

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }
}
