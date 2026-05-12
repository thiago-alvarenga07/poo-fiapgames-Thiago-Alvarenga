package br.com.fiapgames.main;
// Importando as classes necessárias para o funcionamento do sistema
import br.com.fiapgames.model.*;

public class SistemaPrincipal {
    
    public static void main(String[] args) {
        
        System.out.println("=== Teste de interfaces ===");
        System.out.println();

        MouseSemFio mouse = new MouseSemFio("Logitech MX Master 3", 499.99, 101);
        CarroEletrico carro = new CarroEletrico("Tesla Model 3");

        // Ambos dispositivos implementam a interface Recarregavel, então podemos tratá-los de forma polimórfica
        Recarregavel[] dispositivosRecarregaveis = new Recarregavel[] {
            mouse,
            carro
        };

        System.out.println("Recarregando dispositivos:");
        for (Recarregavel x : dispositivosRecarregaveis) {
            x.recarregar(50);

            System.out.println("---");
        }

        System.out.println();
        System.out.println("=== Verificação de tipos ===");

        System.out.println("Mouse é um produto para jogos? " + (mouse instanceof Produto));
        System.out.println("Mouse é um Recarregavel? " + (mouse instanceof Recarregavel));

        System.out.println("Carro é um produto para jogos? " + (Produto.class.isInstance(carro)));
        System.out.println("Carro é um Recarregavel? " + (carro instanceof Recarregavel));

        System.out.println();
        System.out.println("=== Bateria do mouse ===");
        System.out.println(mouse.getCargaAtual());

        System.out.println();
        System.out.println("=== Bateria do carro ===");
        System.out.println(carro.getCargaAtual());
    }
}
