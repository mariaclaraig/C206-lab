public class Item implements Comparable<Item> {

    private String nome;
    private int valor;

    public Item(String nome, int valor) {
        this.valor = valor;
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public int compareTo(Item item2){
        return Integer.compare(item2.getValor(), valor);
    }

    @Override
    public String toString(){
        return nome +  " , " + valor;
    }
}
