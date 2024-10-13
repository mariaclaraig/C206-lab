public class Camiseta extends Produto {

    private String cor;
    private String tamanho;

    public Camiseta(String nome, double preco, String cor, String tamanho) {
        super(nome, preco);
        this.cor = cor;
        this.tamanho = tamanho;
    }

    @Override
    public String etiquetaPreco(){
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
        return super.etiquetaPreco();
    }
}
