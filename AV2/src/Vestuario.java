public class Vestuario extends Item{

    private int tamanho;

    public Vestuario(String nome, double preco, int estoque, int tamanho){
        super(nome, preco, estoque);
        this.tamanho = tamanho;
    }

    public void mostraInfo(){
        System.out.println("Nome do produto: " + getNome());
        System.out.println("Tamanho do produto: " + tamanho);
        System.out.println("Preço do produto: " + getPreco());
        System.out.println("Quantidade no estoque: " + getEstoque());
    }
}
