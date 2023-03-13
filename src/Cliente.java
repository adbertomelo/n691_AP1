public class Cliente extends Pessoa {

    private int id;
    private String cpf;
    private Endereco enderecoPadrao;
    private boolean recebeMensagensPromocionais;

    public String getCpf() {
        return cpf;
    }

    public Endereco getEnderecoPadrao() {
        return enderecoPadrao;
    }

    public boolean RecebeMensagensPromocionais() {
        return recebeMensagensPromocionais;
    }


    public void DefinirEnderecoPadrao(Endereco endereco){
        this.enderecoPadrao = endereco;
    }
    public Cliente(String nome, String cpf, boolean recebeMensagensPromocionais) {
        super(nome);
        this.cpf = cpf;
        this.recebeMensagensPromocionais = recebeMensagensPromocionais;
    }
}
