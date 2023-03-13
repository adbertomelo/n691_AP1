public class Cidade {
    int Id;
    String Nome;
    public  Cidade(String nome)
    {
        this.Id  = Gerador.GetId();
        this.Nome = nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getId() {
        return Id;
    }

    public String getNome() {
        return Nome;
    }
}
