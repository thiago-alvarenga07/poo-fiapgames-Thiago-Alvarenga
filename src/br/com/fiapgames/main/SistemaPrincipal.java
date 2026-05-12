package br.com.fiapgames.main;
// Importando as classes necessárias para o funcionamento do sistema
import br.com.fiapgames.model.*;

public class SistemaPrincipal {
    
    public static void main(String[] args) {
        //Criando objetos concretos
        System.out.println("Teste de classes abstratas");
        System.out.println();

        Produto mouse = new Mouse("Mouse Logitech", 120.0, 1, 16000);
        Produto playstation = new Playstation("PlayStation 5", 4500.0, 2, true);

        System.out.println("Descrição dos produtos:");
        mouse.exibirDescricao();
        playstation.exibirDescricao();

        System.out.println();
        System.out.println("=== Poliformismo com classe abstrata ===");
        
        Produto[] produtos = new Produto[] {
            new Mouse("Mouse Gamer", 150.0, 3, 12000),
            new Playstation("PlayStation 5", 4000.0, 4, false),
            new Mouse("Mouse Simples", 50.0, 5, 8000)
        };

        for (Produto x : produtos) {
            x.exibirDescricao();
            System.out.println("---");
        }
    }
}
