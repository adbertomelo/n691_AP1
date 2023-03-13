public class TipoProduto {

    private int id;
    private String nome;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public TipoProduto(String nome) {
        this.id = Gerador.GetId();
        this.nome = nome;
    }
}
