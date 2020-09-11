package com.example.avaliacao_c1;

public class Livro extends Produto{

    public Livro(String titulo, double preco) {
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
