package br.com.fiapgames.main;
// Importando a classe Usuario
import br.com.fiapgames.model.Usuario;

public class SistemaPrincipal {
    
    public static void main(String[] args) {
        // Criando um novo usuário
        Usuario usuario1 = new Usuario("Thiago Alvarenga", "123", "thiago@gmail.com");
        System.out.println("Recarga de saldo para o usuário " + usuario1.nome);
        usuario1.adicionarSaldo(100.0); // Adicionando saldo ao usuário

        Usuario usuario2 = new Usuario("Maria Silva", "456", "maria@gmail.com");
        System.out.println("Recarga de saldo para o usuário " + usuario2.nome);
        usuario2.adicionarSaldo(150.0);

        // Exibindo as informações dos usuários
        System.out.println("--- Loja de Games ---");
        System.out.println("Usuário: " + usuario1.nome + " | CPF: " + usuario1.cpf + " | Email: " + usuario1.email + " | Saldo: R$ " + usuario1.saldo);
        System.out.println("Usuário: " + usuario2.nome + " | CPF: " + usuario2.cpf + " | Email: " + usuario2.email + " | Saldo: R$ " + usuario2.saldo);

        System.out.println("Realizando compra de jogo para " + usuario1.nome);
        usuario1.comprarJogo(75.0);
        System.out.println("Realizando compra de jogo para " + usuario2.nome);
        usuario2.comprarJogo(100.0);
    }
}
