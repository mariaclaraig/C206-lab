import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Arma arma1 = new Arma(50, 250);
        Arma arma2 = new Arma(75, 300);

        Jogador jogador1 = new Jogador(arma1, 500, 200);
        Jogador jogador2 = new Jogador(arma2, 500, 150);

        System.out.println("=-=-=- INFORMAÇÕES =-=-=-");
        System.out.println("### Info jogador 1: ");
        jogador1.mostraInfo();
        System.out.println("### Info jogador 2: ");
        jogador2.mostraInfo();
        System.out.println("");

        // 1o ataque
        System.out.println("=-=-=- PRIMEIRO ATAQUE =-=-=-");
        System.out.println("############# Jogador 1 atacar Jogador 2: #############");
        jogador1.atacar(jogador2);
        System.out.println("############# Jogador 2 atacar Jogador 1: #############");
        jogador2.atacar(jogador1);
        System.out.println("");

        // 2o ataque
        System.out.println("=-=-=- SEGUNDO ATAQUE =-=-=-");
        System.out.println("############# Jogador 1 atacar Jogador 2: #############");
        jogador1.atacar(jogador2);
        System.out.println("############# Jogador 2 atacar Jogador 1: #############");
        jogador2.atacar(jogador1);
        System.out.println("");

        System.out.println("=-=-=- INFORMAÇÕES =-=-=-");
        System.out.println("### Info jogador 1: ");
        jogador1.mostraInfo();
        System.out.println("### Info jogador 2: ");
        jogador2.mostraInfo();

    }
}