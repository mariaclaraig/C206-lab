public class Main {
    public static void main(String[] args) {

        Vestuario vest1 = new Vestuario("Blusa Amarela", 29.90, 40, 38);
        Vestuario vest2 = new Vestuario("Calça Jeans", 99.90, 61, 40);
        Vestuario vest3 = new Vestuario("Bota Preta", 129.90, 2, 38);

        Alimento alim1 = new Alimento("Cereal", 7.90, 100, "29/11/2024");
        Alimento alim2 = new Alimento("Iogurte", 2.90, 11, "10/11/2024");
        Alimento alim3 = new Alimento("Pão", 8.90, 250, "15/12/2024");

        // Aplicando desconto em 1 item
        vest2.aplicarDesconto(0.15);
        alim2.aplicarDesconto(0.3);

        Carrinho carrinho = new Carrinho();

        // Calculando total do carrinho forçando exception

        try {
            carrinho.calcularTotal();
        } catch (CarrinhoVazioException e){
            System.out.println(e.getMessage());
        }

        System.out.println();

        // Adicionando item com sucesso no carrinho
        System.out.println("Adicionando blusa amarela no carrinho: ");
        try {
            carrinho.adicionarItem(vest1, 1);
        } catch (EstoqueInsuficienteException e){
            System.out.println(e.getMessage());
        }

        System.out.println();

        // Adicionando item no carrinho forçando exception
        System.out.println("Adicionando iogurte no carrinho (exception): ");
        try{
            carrinho.adicionarItem(alim2, 20);
        } catch (EstoqueInsuficienteException e){
            System.out.println(e.getMessage());
        }

        // Adicionando outros itens no carrinho
        try {
            carrinho.adicionarItem(vest2, 3);
        } catch (EstoqueInsuficienteException e){
            System.out.println(e.getMessage());
        }

        try {
            carrinho.adicionarItem(alim3, 5);
        } catch (EstoqueInsuficienteException e){
            System.out.println(e.getMessage());
        }

        try {
            carrinho.adicionarItem(vest3, 1);
        } catch (EstoqueInsuficienteException e){
            System.out.println(e.getMessage());
        }

        try {
            carrinho.adicionarItem(alim1, 2);
        } catch (EstoqueInsuficienteException e){
            System.out.println(e.getMessage());
        }

        System.out.println();

        // Calculando total do carrinho sem exception
        try {
            carrinho.calcularTotal();
        } catch (CarrinhoVazioException e){
            System.out.println(e.getMessage());
        }

        System.out.println();

        // Usando método para exibir itens no carrinho:
        carrinho.exibirItens();
    }
}