package modell;

public class Venda {
    Produto produto;
    double total;
    double desconto;
    double subtotal;

    public Venda(Produto produto, double total,double desconto, double subtotal) {
        this.produto = produto;
        this.total = total;
        this.desconto = desconto;
        this.subtotal = subtotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}


