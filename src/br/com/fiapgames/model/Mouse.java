package br.com.fiapgames.model;

public class Mouse extends Produto {
    private int dpi;

    public Mouse(String nome, double preco, int id, int dpi) {
        
        // Chama o construtor da classe mãe (Produto) para inicializar os atributos comuns
        super(nome, preco, id);

        this.setDpi(dpi);
    }

    // getters e setters para o atributo específico do Mouse
    public int getDpi() {
        return this.dpi;
    }

    private void setDpi(int dpi) {
        if (dpi > 0 && dpi <= 16000) {
            this.dpi = dpi;
        } else {
            System.out.println("Erro de segurança: O DPI deve ser um valor positivo.");
        }
    }
    
}
