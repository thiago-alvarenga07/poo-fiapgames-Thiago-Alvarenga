package br.com.fiapgames.model;

public class Produto {
    
    // Atributos do produto
    private String nome;
    private double preco;
    private int id;
    private double desconto;

    public Produto(String nome, double preco, int id) {
        this.nome = nome;
        this.setPreco(preco);
        this.id = id;
        System.out.println("Produto " + this.nome + " adicionado com o id: " + this.id);
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    private void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro de segurança: O preço deve ser um valor positivo.");
        }
    }

    public void atualizarPreco(double novoPreco) {
        if (novoPreco > 0) {
            this.preco = novoPreco;
            System.out.println("Preço atualizado para: R$ " + this.preco);
        } else {
            System.out.println("Erro de segurança: O novo preço deve ser um valor positivo.");
        }
    }

    public int getId() {
        return this.id;
    }

    public double calcularDesconto() {
        System.out.println("O desconto não pode ser aplicado para um produto genérico.");
        return 0.0;
    }
}
