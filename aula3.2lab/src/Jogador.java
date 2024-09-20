public class Jogador {

    private Arma arma;
    private int energia;
    private int vida;

    public Jogador() {
    }

    public Jogador(Arma arma, int energia, int vida) {
        this.arma = arma;
        this.energia = energia;
        this.vida = vida;
    }

    public void atacar(Jogador alvo){

        if(this.energia > this.arma.getCustoDeEnergia()){
            System.out.println("O ataque está sendo realizado. ");
            alvo.vida -= this.arma.getDano();
            this.energia -= this.arma.getCustoDeEnergia();
            System.out.println("Vida do alvo após ataque: " + alvo.vida);
            System.out.println("Energia do jogador após ataque: " + this.energia);
        }
        else{
            System.out.println("O ataque não pode ser executado, não há energia suficiente. ");
        }
    }

    void mostraInfo(){
        System.out.println("Energia: " + this.energia);
        System.out.println("Vida: " + this.vida);
        System.out.println("Informações da arma obtida: Custo de uso de " + this.arma.getCustoDeEnergia() + " e dano de " + this.arma.getDano());
    }
}
