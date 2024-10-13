import java.util.Scanner;

public class Banda {
    private Musica[] musicas = new Musica[10];
    private String nome;
    private int numeroDeIntegrantes;
    Scanner entrada = new Scanner(System.in);

    public Banda(String nome, int numeroDeIntegrantes) {
        this.nome = nome;
        this.numeroDeIntegrantes = numeroDeIntegrantes;
    }

    public boolean adicionarMusica(Musica musica){
        boolean aux = false;
        for (int i=0; i<this.musicas.length; i++) {
            if (musicas[i] == null) {
                musicas[i] = musica;
                aux = true;
                System.out.println("Música " + i + " adicionada com sucesso. ");
                return true;
            }
        }
        System.out.println("Música não foi adicionada. ");
        return false;
    }

    public void tocarMusica(int posicao){
        if(this.musicas[posicao] != null){
            System.out.println("Informações da música escolhida: ");
            System.out.print("Música na posição " + posicao + ": '" + musicas[posicao].getNome() + "', ");
            System.out.println("do álbum '" + musicas[posicao].getAlbum() + "' tocando.");
        }
        else {
            System.out.println("Não existe música nesse código. ");
        }
    }

    public void tocarShow(){
        System.out.println("Show da banda");
        for (int i=0; i<this.musicas.length; i++) {
            if (musicas[i] != null) {
                System.out.println("Música " + i + ", ");
                System.out.print("'" + musicas[i].getNome() + "' ");
                System.out.println("do álbum '" + musicas[i].getAlbum() + "' tocando. ");
            }
        }
    }

    public boolean deletarMusica(String nome){
        boolean aux = false;
        for (int i=0; i<this.musicas.length; i++) {
            if (musicas[i] != null && musicas[i].getNome().equals(nome)) {
                musicas[i] = null;
                aux = true;
                System.out.println("Música deletada com sucesso. ");
                return true;
            }
        }
        System.out.println("Música não foi deletada. ");
        return false;
    }
}
