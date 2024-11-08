public class Alimento extends Item{

    private String validade;

    public Alimento(String nome, double preco, int estoque, String validade) {
        super(nome, preco, estoque);
        this.validade = validade;
    }

    public void mostraInfo() {
        System.out.println("Nome do produto: " + getNome());
        System.out.println("Validade do produto: " + validade);
        System.out.println("Preço do produto: " + getPreco());
        System.out.println("Quantidade no estoque: " + getEstoque());
    }
}
