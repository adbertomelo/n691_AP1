import java.util.ArrayList;
public class Fornecedor extends Pessoa {

    private String CNPJ;
    private ArrayList<Produto> ItensQueVende;
    public Fornecedor(String nome, String cnpj) {
        super(nome);
        this.CNPJ = cnpj;
    }

    public void AdicionarItemQueVende(Produto produto)
    {
        this.ItensQueVende.add(produto);
    }
}
