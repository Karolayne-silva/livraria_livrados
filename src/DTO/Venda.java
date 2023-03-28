public class ItemVenda {
    private String vendedor;
    private String dataVenda;
    private double valorTotal;

    // Construtor
    public Produto(String vendedor, String dataVenda, double valorTotal){
        this.vendedor = vendedor;
        this.dataVenda = dataVenda;
        this.valorTotal = valorTotal;
    }

    // Getters e Setters

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}

