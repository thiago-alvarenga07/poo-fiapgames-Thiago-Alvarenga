package br.com.fiapgames.model;
// Classe que representa um usuário do sistema
public class Usuario {
    // Atributos do usuário
    public String nome;
    public String cpf;
    public String email;
    public double saldo;

    public Usuario(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.saldo = 0.0;

    }

    public void adicionarSaldo(double valor) {
        // Regra de negócio: O valor a ser adicionado deve ser positivo
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Saldo atualizado: R$ " + this.saldo);
        } else {
            System.out.println("Erro: O valor a ser adicionado deve ser positivo.");
        }
    }

    public void comprarJogo(double custo) {
        // Regra de negócio: O usuário deve ter saldo suficiente para comprar o jogo
        if (custo <= 0) {
            System.out.println("Erro: O custo do jogo deve ser positivo.");
            return;
        }
        if (this.saldo < custo) {
            System.out.println("Erro: Saldo insuficiente para realizar a compra.");
            return;
        }
        this.saldo -= custo;
        System.out.println("Compra realizada com sucesso! Saldo restante: R$ " + this.saldo);
    }
}
