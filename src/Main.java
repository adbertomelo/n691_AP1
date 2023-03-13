public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Adberto Melo","99999999999",true);
        Cidade fortaleza = new Cidade("Fortaleza");
        Endereco endereco1 = new Endereco("1", 1, "b1", "c1", fortaleza);
        cliente.AdicionarEndereco(endereco1);
        Endereco endereco2 = new Endereco("2", 2, "b2", "c2", fortaleza);
        cliente.AdicionarEndereco(endereco2);
        cliente.DefinirEnderecoPadrao(endereco2);

        Fornecedor fornecedor = new Fornecedor("Adberto Melo Ltda.","99999999000100");
        Endereco endereco3 = new Endereco("3",3,"b3","c3", fortaleza);
        fornecedor.AdicionarEndereco(endereco3);
        Endereco endereco4 = new Endereco("4",4,"b4","c4", fortaleza);
        fornecedor.AdicionarEndereco(endereco4);
        Produto produto = new Produto("Sabonete", new TipoProduto("Higiene"), 20, "Sem Cheiro");
        fornecedor.AdicionarItemQueVende(produto);

    }
}