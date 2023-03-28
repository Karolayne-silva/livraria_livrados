package DTO;

public class ItemVenda {
    private int quantidade;
    private double desconto; // padrão = 0.0

    // Construtor
    public Produto(int quantidade, double desconto){
        this.quantidade = quantidade;
        this.desconto = desconto;
    }

    // Getters e Setters

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}

