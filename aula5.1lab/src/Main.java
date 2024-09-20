import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o raio: ");
        double raio = entrada.nextInt();
        System.out.print("Insira a altura: ");
        double altura = entrada.nextInt();

        System.out.println(Calculadora.cincunferencia(raio));
        System.out.println(Calculadora.volumeEsfera(raio));
        System.out.println(Calculadora.volumeCilindro(raio, altura));

    }
}