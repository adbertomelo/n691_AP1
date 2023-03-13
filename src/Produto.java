public class Produto {

    private int id;
    private String Nome;
    private TipoProduto tipoproduto;
    private double PercentualDeLucro;
    private String Caracteristicas;

    public Produto(String nome, TipoProduto tipoproduto, double percentualDeLucro, String caracteristicas) {
        this.id = Gerador.GetId();
        Nome = nome;
        this.tipoproduto = tipoproduto;
        PercentualDeLucro = percentualDeLucro;
        Caracteristicas = caracteristicas;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public TipoProduto getTipoproduto() {
        return tipoproduto;
    }

    public void setTipoproduto(TipoProduto tipoproduto) {
        this.tipoproduto = tipoproduto;
    }

    public double getPercentualDeLucro() {
        return PercentualDeLucro;
    }

    public void setPercentualDeLucro(double percentualDeLucro) {
        PercentualDeLucro = percentualDeLucro;
    }

    public String getCaracteristicas() {
        return Caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        Caracteristicas = caracteristicas;
    }
    public Estoque GetEstoque(int id){

        return Estoque.GetEstoquePorIdProduto(id);

    }
}
