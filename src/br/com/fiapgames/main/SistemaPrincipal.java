package br.com.fiapgames.main;
// Importando Todas as classes
import br.com.fiapgames.model.Usuario;
import br.com.fiapgames.model.Carrinho;
import br.com.fiapgames.model.Produto;

public class SistemaPrincipal {
    
    public static void main(String[] args) {
        // Criando um novo produto
        Produto pragmata = new Produto("Pragmata", 150.0, 1);
        // Criando um novo usuário
        Usuario joao = new Usuario("João", "222", "joao@email.com");
        // Adicionando carrinho
        Carrinho carrinhoDoJoao = new Carrinho("Rua A, 123", joao, pragmata);
        
        // Exibindo detalhes do carrinho
        carrinhoDoJoao.exibirDetalhes();

        // Adicionando saldo ao usuário
        joao.adicionarSaldo(200.0);
        
        // Testando para ver se o carrinho consegue ver o saldo alterado
        System.out.println("Saldo consultado através do carrinho: R$ " + carrinhoDoJoao.getCliente().getSaldo());
    }
}
