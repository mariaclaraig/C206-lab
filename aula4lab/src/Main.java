import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Autor autor1 = new Autor();
        autor1.nome = "J.K. Rowling";
        Autor autor2 = new Autor();
        autor2.nome = "Suzanne Collins";

        Saga saga1 = new Saga();
        saga1.nota = 9;
        Saga saga2 = new Saga();
        saga2.nota = 10;

        Livro livro1 = new Livro("H.P Pedra Filosofal", 280);
        Livro livro2 = new Livro("H.P Câmara Secreta", 260);
        Livro livro3 = new Livro("H.P Prisioneiro de Azkaban", 300);

        saga1.adicionarLivro(livro1);
        saga1.adicionarLivro(livro2);
        saga1.adicionarLivro(livro3);

        Livro livro4 = new Livro("Jogos Vorazes", 400);
        Livro livro5 = new Livro("Em Chamas", 320);
        Livro livro6 = new Livro("A esperança: Parte 1", 450);

        saga2.adicionarLivro(livro4);
        saga2.adicionarLivro(livro5);
        saga2.adicionarLivro(livro6);

        autor1.adicionarSaga(saga1);
        autor2.adicionarSaga(saga2);

        System.out.println("Sagas por " + autor1.nome + ": ");
        autor1.listarSagas();
        System.out.print("Livros registrados das sagas: ");
        saga1.listarLivros();

        System.out.println("Sagas por " + autor2.nome + ": ");
        autor2.listarSagas();
        System.out.print("Livros registrados das sagas: ");
        saga2.listarLivros();
    }
}