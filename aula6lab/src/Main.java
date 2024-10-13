public class Main {
    public static void main(String[] args) {

        Produto[] produtos = new Produto[10];

        Produto notebook1 = new Notebook("Dell XPS 13", 10000, 512, "Intel Iris Xe Graphics", "Intel Core i7" );
        Produto camiseta1 = new Camiseta("Nike", 150, "Azul", "M");

        produtos[0] = notebook1;
        produtos[1] = camiseta1;

        for (int i=0; i< produtos.length; i++){
            if(produtos[i] != null){
                produtos[i].etiquetaPreco();
                System.out.println();
            }
        }
    }
}