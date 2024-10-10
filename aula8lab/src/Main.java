public class Main {
    public static void main(String[] args) {

        Corredor atletaCorrida = new Corredor();
        Ciclista atletaCiclismo = new Ciclista();
        Nadador atletaNatacao = new Nadador();

        // chamar métodos

        atletaCiclismo.colocarEquipamento();
        atletaCorrida.colocarEquipamento();
        atletaNatacao.treinar();
        atletaCorrida.treinar();
        atletaCiclismo.treinar();

    }
}