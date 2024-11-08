public abstract class Item implements AplicarDesconto{

    private String nome;
    private double preco;
    private int estoque;

    public Item(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    @Override
    public double aplicarDesconto(double porcentagem){
        return (preco * porcentagem);
    }

    public boolean verificarEstoque(int quantidade){
        if(quantidade<=estoque){
            return true;
        }
        else{
            return false;
        }
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade no estoque: " + estoque);
    }

    @Override
    public String toString(){
        return "Nome do item: " + nome + " || Preço: " + preco + " || Quantidade em estoque: " + estoque + " ||";
    }
}
