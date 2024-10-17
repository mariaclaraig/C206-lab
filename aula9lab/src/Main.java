import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        Item item1 = new Item("Carregador", 100);
        Item item2 = new Item("Capinha", 20);
        Item item3 = new Item("Fone", 90);

        estoque.adicionarArray(item1);
        estoque.adicionarArray(item2);
        estoque.adicionarArray(item3);

        estoque.ordenarItens();
        estoque.mostrarItens();
        estoque.buscar(2);

        Item item4 = new Item("Película", 15);
        estoque.modificar(item4, 1);
        estoque.mostrarItens();

        estoque.deletar(0);
        estoque.mostrarItens();

        estoque.deletar(item4);
        estoque.mostrarItens();





    }
}