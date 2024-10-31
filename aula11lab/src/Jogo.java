public class Jogo {

    private int id;
    private String nome;
    private double preco;

    public Jogo(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void mostrarInfo(){
        System.out.println("Informações do jogo/// ");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }
}
