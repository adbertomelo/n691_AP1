import java.util.ArrayList;
public abstract class Pessoa {
    private int id;
    private String nome;
    private ArrayList<Contato> contatos;
    private ArrayList<Endereco> enderecos;

    public Pessoa(String nome)
    {
        this.nome = nome;
        this.id = Gerador.GetId();
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Contato> getContatos() {
        return contatos;
    }
    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }
    public void AdicionarEndereco(Endereco endereco){
        this.enderecos.add(endereco);
    }
    public void AdicionarContato(Contato contato)
    {
        this.contatos.add(contato);
    }

}
