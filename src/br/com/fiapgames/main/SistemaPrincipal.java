package br.com.fiapgames.main;
// Importando as classes necessárias para o funcionamento do sistema
import br.com.fiapgames.model.Playstation;
import br.com.fiapgames.model.Mouse;

public class SistemaPrincipal {
    
    public static void main(String[] args) {
       
        Mouse mouse1 = new Mouse("Mouse Logitech", 100.0, 1, 16000);
        Playstation ps5 = new Playstation("PlayStation 5", 4500.0, 2, true);

        // Testando se as classes filhas conseguem acessar os métodos da classe mãe (Produto)
        System.out.println("Produto: " + mouse1.getNome() + " | Preço: R$ " + mouse1.getPreco() + " | DPI: " + mouse1.getDpi());
        System.out.println("Produto: " + ps5.getNome() + " | Preço: R$ " + ps5.getPreco() + " | Tem Disco: " + ps5.isHasDisco());

        if(ps5.isHasDisco()) {
            System.out.println("O " + ps5.getNome() + " é a versão com disco.");
        } else {
            System.out.println("O " + ps5.getNome() + " é a versão digital.");
        }
    }
}
