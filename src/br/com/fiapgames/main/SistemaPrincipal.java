package br.com.fiapgames.main;
// Importando a classe Usuario
import br.com.fiapgames.model.Usuario;

public class SistemaPrincipal {
    
    public static void main(String[] args) {
        // Criando um novo usuário
        Usuario usuario1 = new Usuario("Thiago Alvarenga", "123", "thiago@gmail.com");
        System.out.println("Recarga de saldo para o usuário " + usuario1.getNome());
        usuario1.adicionarSaldo(100.0); // Adicionando saldo ao usuário

        Usuario usuario2 = new Usuario("Maria Silva", "456", "maria@gmail.com");
        System.out.println("Recarga de saldo para o usuário " + usuario2.getNome());
        usuario2.adicionarSaldo(150.0);

        // Exibindo as informações dos usuários
        System.out.println("--- Loja de Games ---");
        System.out.println("Usuário: " + usuario1.getNome() + " | CPF: " + usuario1.getCpf() + " | Email: " + usuario1.getEmail() + " | Saldo: R$ " + usuario1.getSaldo());
        System.out.println("Usuário: " + usuario2.getNome() + " | CPF: " + usuario2.getCpf() + " | Email: " + usuario2.getEmail() + " | Saldo: R$ " + usuario2.getSaldo());
        
        System.out.println("\n--- Realizando compras ---");
        System.out.println("Realizando compra de jogo para " + usuario1.getNome());
        usuario1.comprarJogo(75.0);
        System.out.println("Realizando compra de jogo para " + usuario2.getNome());
        usuario2.comprarJogo(200.0);
    }
}
