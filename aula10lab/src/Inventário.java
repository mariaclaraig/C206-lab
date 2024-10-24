import java.util.ArrayList;

public class Inventário {

    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) throws LivroInvalidoException{
        if(livro.getTitulo().isEmpty() || livro.getPreco()<0){
            if(livro.getTitulo().isEmpty()) {
                throw new LivroInvalidoException("Título vazio, impossível adicionar. ");
            }
            if(livro.getPreco()<0){
                throw new LivroInvalidoException("Preço inválido, impossível adicionar. ");
            }
        }
        else{
            livros.add(livro);
            System.out.println("Livro adicionado com sucesso. ");
        }
    }

    public void exibirLivros(){
        System.out.println("Livros do inventário: " + livros);
    }
}
