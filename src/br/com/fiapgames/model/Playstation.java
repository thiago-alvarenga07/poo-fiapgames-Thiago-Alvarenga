package br.com.fiapgames.model;
// Classe filha extende a mãe, ou seja, é um tipo específico de Produto
public class Playstation extends Produto {
    // Atributo para indicar se o Playstation possui disco ou é apenas digital
    private boolean hasDisco;

    public Playstation(String nome, double preco, int id, boolean hasDisco) {
        super(nome, preco, id);
        this.hasDisco = hasDisco;
    }

    public boolean isHasDisco() {
        return this.hasDisco;
    }
}