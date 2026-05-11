package br.com.fiapgames.main;
// Importando a classe Produto
import br.com.fiapgames.model.Produto;

public class SistemaPrincipal {
    
    public static void main(String[] args) {
        Produto produto1 = new Produto("Pragmata", 150.0, 1);
        // Criando um novo usuário
        System.out.println("--- Produtos ---");
        System.out.println("Produto: " + produto1.getNome() + " - Preço: R$ " + produto1.getPreco());
    }
}
