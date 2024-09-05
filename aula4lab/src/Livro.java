public class Livro {
    String titulo;
    int paginas;

    // construtor
    Livro(String titulo, int paginas){
        this.titulo = titulo;
        this.paginas = paginas;
    }

    void infoLivro(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Quant. páginas: " + this.paginas);
    }

}
