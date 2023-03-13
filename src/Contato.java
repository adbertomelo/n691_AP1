import java.util.Random;

public class Contato {

    private  int id;
    private TipoContato tipocontato;
    private String valor;

    public Contato(TipoContato tipocontato, String valor) {
        this.id = Gerador.GetId();
        this.tipocontato = tipocontato;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public TipoContato getTipocontato() {
        return tipocontato;
    }

    public void setTipocontato(TipoContato tipocontato) {
        this.tipocontato = tipocontato;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
