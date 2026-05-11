package br.com.fiapgames.main;
// Importando a classe Usuario
import br.com.fiapgames.model.Usuario;

public class SistemaPrincipal {
    
    public static void main(String[] args) {
        // Criando um novo usuário
        Usuario usuario1 = new Usuario();
        usuario1.nome = "Thiago Alvarenga";
        usuario1.email = "thiago@gmail.com";
        usuario1.saldo = 100.0;

        Usuario usuario2 = new Usuario();
        usuario2.nome = "Maria Silva";
        usuario2.email = "maria@gmail.com";
        usuario2.saldo = 150.0;

        // Exibindo as informações dos usuários
        System.out.println("--- Loja de Games ---");
        System.out.println("Usuário: " + usuario1.nome + " | Email: " + usuario1.email + " | Saldo: R$ " + usuario1.saldo);
        System.out.println("Usuário: " + usuario2.nome + " | Email: " + usuario2.email + " | Saldo: R$ " + usuario2.saldo);
    }
}
