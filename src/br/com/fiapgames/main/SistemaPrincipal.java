package br.com.fiapgames.main;
// Importando as classes necessárias para o funcionamento do sistema
import br.com.fiapgames.model.*;
import java.util.ArrayList;
import java.util.List;

public class SistemaPrincipal {
    
    public static void main(String[] args) {
       //Criando uma lista para armazenar os produtos
        List<Produto> produtosDisponiveis = new ArrayList<>();

        // Criando alguns produtos e adicionando à lista

        produtosDisponiveis.add(new Mouse("Mouse Logitech", 199.90, 1, 16000));
        produtosDisponiveis.add(new Playstation("PlayStation 5", 4999.90, 3, true));

        for (Produto produto : produtosDisponiveis) {
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Preço original: R$ " + produto.getPreco());
            double precoComDesconto = produto.calcularDesconto();
            if (precoComDesconto < produto.getPreco()) {
                System.out.println("Preço com desconto: R$ " + precoComDesconto);
            } else {
                System.out.println("Sem desconto disponível para este produto.");
            }
            System.out.println("-----------------------------");
        }
    }
}
