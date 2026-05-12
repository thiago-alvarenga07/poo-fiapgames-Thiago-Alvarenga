package br.com.fiapgames.model;

public class CarroEletrico implements Recarregavel {

    private String modelo;
    private int cargaAtual;

    public CarroEletrico(String modelo) {
        this.modelo = modelo;
        this.cargaAtual = 0; // Inicialmente, o carro está descarregado
    }

    @Override
    public void recarregar(int porcentagem) {
        if (porcentagem < CargaMinima || porcentagem > CargaMaxima) {
            System.out.println("Erro de segurança: A porcentagem de recarga deve estar entre " + CargaMinima + "% e " + CargaMaxima + "%.");
            return;
        }
        
        System.out.println(this.modelo + " recarregado em " + porcentagem + "%.");
        this.cargaAtual = porcentagem;
    }

    public int getCargaAtual() {
        return this.cargaAtual;
    }
    
}
