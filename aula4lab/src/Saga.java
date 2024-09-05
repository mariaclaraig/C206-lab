public class Saga {

    int nota;
    Livro[] livros = new Livro[10];

    void adicionarLivro(Livro livro){
        for(int i=0; i<this.livros.length; i++){
            if(this.livros[i] == null){
                this.livros[i] = livro;
                break;
            }
        }
    }

    void listarLivros() {
        for (int i=0; i<this.livros.length; i++) {
            if (this.livros[i] != null) {
                this.livros[i].infoLivro();
            }
        }
    }

}
