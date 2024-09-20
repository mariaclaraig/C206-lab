import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.np1 = entrada.nextInt();
        aluno.np2 = entrada.nextInt();
        aluno.nome = "Matheus";
        aluno.matricula = 299;
        aluno.periodo = 5;

        System.out.println(" ");

        aluno.calculaMedia();
        aluno.mostraInfo();
    }
}