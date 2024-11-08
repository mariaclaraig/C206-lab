import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Item> carrinhoArray = new ArrayList<>();

    public void adicionarItem (Item item, int quantidade) throws EstoqueInsuficienteException{
        if(item.verificarEstoque(quantidade)==false){
            throw new EstoqueInsuficienteException("Não há quantidade suficiente do item no estoque. ");
        }
        else{
            carrinhoArray.add(item);
            System.out.println("Item adicionado com sucesso. ");
        }
    }

    public double calcularTotal() throws CarrinhoVazioException{
        double total = 0.00;
        if(carrinhoArray.isEmpty()){
            throw new CarrinhoVazioException("O carrinho está vazio. ");
        }
        else{
            for(Item item : carrinhoArray){
                total = total + item.getPreco();
                System.out.println(item.getPreco());
            }
            System.out.println("Total das compras: " + total + "R$");
            return total;
        }
    }

    public void exibirItens() {
        if (carrinhoArray.isEmpty()) {
            System.out.println("O carrinho está vazio. ");
        } else {
            System.out.println("Itens no carrinho: " + carrinhoArray);
        }
    }
}
