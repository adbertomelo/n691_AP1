public class Estoque {
    private double QuantidadeCompras;
    private double QuantidadeVendas;
    private double SaldoEmEstoque;
    private double ValorCusto;
    public double getQuantidadeCompras() {
        return QuantidadeCompras;
    }

    public double getQuantidadeVendas() {
        return QuantidadeVendas;
    }

    public double getSaldoEmEstoque() {
        return this.QuantidadeCompras - this.QuantidadeVendas;
    }
    public double getValorCusto() {
        return ValorCusto;
    }

    public Estoque(double quantidadeCompras, double quantidadeVendas, double valorCusto) {
        QuantidadeCompras = quantidadeCompras;
        QuantidadeVendas = quantidadeVendas;
        ValorCusto = valorCusto;
    }
    public static Estoque GetEstoquePorIdProduto(int idProduto){
        return new Estoque(100,50,15.99);
    }
}
