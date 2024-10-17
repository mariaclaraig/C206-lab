import java.util.ArrayList;
import java.util.Collections;

public class Estoque {

    private ArrayList<Item> produtos;

    public ArrayList<Item> getProdutos() {
        return produtos;
    }

    public Estoque(){
        this.produtos = new ArrayList<Item>();
    }

    public void adicionarArray(Item item){
        produtos.add(item);
    }

    public void buscar(int posicao){
        for(int i=0; i< produtos.size(); i++){
            if(produtos.contains(posicao)){
                System.out.println(produtos.get(posicao));
            }
        }
    }

    public void deletar(int posicao){
        for(int i=0; i< produtos.size(); i++){
            if(produtos.contains(posicao)){
                produtos.remove(posicao);
                System.out.println("Deletado com sucesso. ");
            }
        }
    }

    public void deletar(Item item){
        produtos.removeAll(produtos);
        System.out.println("Itens deletados com sucesso. ");
    }

    public void modificar(Item item, int posicao){
        for(int i=0; i<produtos.size(); i++){
            produtos.set(posicao, item);
        }
    }

    public void ordenarItens(){
        Collections.sort(produtos);
    }

    public void mostrarItens(){
        for(int i=0; i<produtos.size(); i++){
            System.out.println(produtos);
        }
    }
}