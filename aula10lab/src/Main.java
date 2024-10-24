public class Main {
    public static void main(String[] args) {

        Inventário inventario = new Inventário();

        Livro livro0 = new Livro("A crise da narração", "Byung-Chul", 33.90);
        Livro livro1 = new Livro("Sociedade do cansaço", "Byung-Chul", 30.90);
        Livro livro2 = new Livro("", "Byung-Chul", 25.90);
        Livro livro3 = new Livro("Sociedade Paliativa", "Byung-Chul", -30);

        // caso livro 1: correto
        try{
            inventario.adicionarLivro(livro1);
        } catch (LivroInvalidoException e){
            System.out.println(e.getMessage());
        }

        // caso livro 2: nome é string vazia
        try{
            inventario.adicionarLivro(livro2);
        } catch (LivroInvalidoException e){
            System.out.println(e.getMessage());
        }

        // caso livro 3: preço é menor que 0
        try{
            inventario.adicionarLivro(livro3);
        } catch (LivroInvalidoException e){
            System.out.println(e.getMessage());
        }

        inventario.exibirLivros();
        System.out.println(livro1.toString());
    }
}