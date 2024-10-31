public class Main {
    public static void main(String[] args) {

        Jogo jogo1 = new Jogo(1, "Tetris", 9.90);
        Jogo jogo2 = new Jogo(2, "Campo Minado", 5.90);
        Jogo jogo3 = new Jogo(3, "Paciência", 10.90);

        Arquivo arquivo = new Arquivo();
        arquivo.escrever(jogo1);
        arquivo.escrever(jogo2);
        arquivo.escrever(jogo3);

        System.out.println("LER JOGO 1 POR MOSTRARINFO: ");
        jogo1.mostrarInfo();

        System.out.println("LER JOGO 2 PELO PREÇO: ");
        arquivo.lerJogo(5.90);

        System.out.println("LER JOGO 3 PELO PREÇO: ");
        arquivo.lerJogo(10.90);

//        System.out.println("LER JOGO ? PELO PREÇO: ");
//        arquivo.lerJogo(6.90);

        System.out.println("LER TODOS OS JOGOS: ");
        arquivo.lerJogos();
    }
}