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

    @Override
    public double calcularDesconto() {
        // Exemplo de regra de desconto específica para Mouse
        if (this.getPreco() > 150) {
            return this.getPreco() * 0.90; // 10% de desconto para mouses acima de R$150
        } else {
            return this.getPreco(); // Sem desconto para mouses com preço igual ou inferior a R$150
        }
    }
    
}
