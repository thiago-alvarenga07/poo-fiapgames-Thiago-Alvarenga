package br.com.fiapgames.model;
// Classe que representa um usuário do sistema
public class Usuario {
    // Atributos do usuário
    private String nome;
    private String cpf;
    private String email;
    private double saldo;

    public Usuario(String nome, String cpf, String email) {
        this.setNome(nome);
        this.cpf = cpf;
        this.setEmail(email);
        this.setSaldo(0.0); // Saldo inicial do usuário é zero
    }

    // Método para leitura do saldo do usuário
    public double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double valor) {
        if (valor >= 0) {
            this.saldo = valor;
        } else {
            System.out.println("Erro de segurança: O saldo deve ser um valor positivo.");
        }
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public void adicionarSaldo(double valor) {
        // Regra de negócio: O valor a ser adicionado deve ser positivo
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Saldo atualizado: R$ " + this.saldo);
        } else {
            System.out.println("Erro de segurança: O valor a ser adicionado deve ser positivo.");
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
