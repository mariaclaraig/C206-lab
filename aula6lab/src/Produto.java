public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String etiquetaPreco(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: " + preco + "R$");
        System.out.println();
        return "";
    }
}
