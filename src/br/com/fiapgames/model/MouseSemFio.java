package br.com.fiapgames.model;

public class MouseSemFio extends Produto implements Recarregavel {

    private int cargaAtual;

    public MouseSemFio(String nome, double preco, int id) {

        super(nome, preco, id);
    }

    @Override
    public void recarregar(int porcentagem) {
        if (porcentagem < CargaMinima || porcentagem > CargaMaxima) {
            System.out.println("Erro de segurança: A porcentagem de recarga deve estar entre " + CargaMinima + "% e " + CargaMaxima + "%.");
            return;
        }
        
        System.out.println("Mouse " + getNome() + " recarregado em " + porcentagem + "%.");
        this.setCargaAtual(porcentagem);
    }

    @Override
    public void exibirDescricao() {
        System.out.println("Mouse Wireless - Nome: " + getNome() + ", Preço: R$ " + getPreco() + ", Carga Atual: " + this.cargaAtual + "%");
    }

    public int getCargaAtual() {
        return this.cargaAtual;
    }
    
    public void setCargaAtual(int cargaAtual) {
        this.cargaAtual = cargaAtual;
    }
}
