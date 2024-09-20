import java.util.Scanner;

public class Aluno {

    int matricula;
    int np1;
    int np2;
    int periodo;
    String nome;

    int calculaMedia(){
        int media = (np1 + np2)/2;
        if(media<=60 && media>=30){
            System.out.println("Você está de NP3. ");
        }
        else{
            if(media<=30){
                System.out.println("Você foi reprovado direto. ");
            }
            else {
                System.out.println("Você passou direto com média " + media + ".");
            }
        }
        return media;
    }

    int calculaNP3(int media){
        Scanner entrada = new Scanner(System.in);
        int np3 = entrada.nextInt();
        int novamedia = np3 + media;
        if(novamedia<=50){
            System.out.println("Você está reprovado. ");
        }
        else {
            System.out.println("Você foi aprovado! ");
        }
        return novamedia;
    }

    void mostraInfo(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Período: " + periodo);
        System.out.println("NP1: " + np1);
        System.out.println("NP2: " + np2);
    }
}
