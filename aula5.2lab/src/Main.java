
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Musica musica1 = new Musica ("Tubthumper", "Tubthumping");
        Musica musica2 = new Musica("Amnesia", "Tubthumping");
        Musica musica3 = new Musica("Mary, Mary", "Tubthumping");

        Banda banda1 = new Banda("Chumbawamba", 4);

        banda1.adicionarMusica(musica1);
        banda1.adicionarMusica(musica2);
        banda1.adicionarMusica(musica3);

        System.out.println();

        Musica musica4 = new Musica("Stayin' Alive", "How Can You Mend a Broken Heart");
        Musica musica5 = new Musica("More Than a Woman", "How Can You Mend a Broken Heart");
        Musica musica6 = new Musica("How Deep Is Your Love", "How Can You Mend a Broken Heart");

        Banda banda2 = new Banda("Bee Gees", 3);

        banda2.adicionarMusica(musica5);
        banda2.adicionarMusica(musica6);
        banda2.adicionarMusica(musica4);

        System.out.println();

        banda1.tocarMusica(1);
        System.out.println();
        banda1.tocarMusica(7);
        System.out.println();

        banda2.tocarShow();
        System.out.println();

        banda1.deletarMusica("Amnesia");
        System.out.println();
        banda2.deletarMusica("Night Fever");
        System.out.println();
    }
}