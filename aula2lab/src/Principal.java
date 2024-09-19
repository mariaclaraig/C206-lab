import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o valor de n para descobrir seu fatorial e os números pares no intervalo: ");
        int n = entrada.nextInt();

        Operacoes resultadoFatorial = new Operacoes();

        System.out.print("Resultado do fatorial de " + n + ": ");
        System.out.println(resultadoFatorial.calcFatorial(n));

        Operacoes resultadomostraPares = new Operacoes();

        System.out.print("Pares entre 0 e " + n + ": ");
        resultadomostraPares.mostraPares(n);

    }
}

