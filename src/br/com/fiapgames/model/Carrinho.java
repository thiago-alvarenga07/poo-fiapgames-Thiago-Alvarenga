package br.com.fiapgames.model;

public class Carrinho {
    //Atributo simples
    private String destino;

    //Atributo de associação
    private Usuario cliente;
    private Produto detalhesProduto;

    public Carrinho(String destino, Usuario cliente, Produto detalhesProduto) {
        this.destino = destino;
        this.cliente = cliente;
        this.detalhesProduto = detalhesProduto;

        System.out.println("Carrinho criado com o produto: " + detalhesProduto.getNome() + " para o usuário: " + cliente.getNome());
    }

    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Carrinho ---");
        System.out.println("Local da entrega: " + destino);
        System.out.println("Usuário: " + cliente.getNome());
        System.out.println("Produto: " + detalhesProduto.getNome() + " - Preço: R$ " + detalhesProduto.getPreco());
        System.out.println("-----------------------------\n");
    }

    // Getters dos atributos
    public String getDestino() { return destino; }
    public Usuario getCliente() { return cliente; }
    public Produto getDetalhesProduto() { return detalhesProduto; }
}
