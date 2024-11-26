package org.example;

import br.inatel.DAO.ConnectionDAO;
import br.inatel.DAO.InscricoesDAO;
import br.inatel.DAO.IngressosDAO;
import br.inatel.DAO.ParticipantesDAO;
import br.inatel.DAO.OrganizadoresDAO;
import br.inatel.DAO.EventosDAO;

import br.inatel.Model.Participantes;
import br.inatel.Model.Inscricoes;
import br.inatel.Model.Ingressos;
import br.inatel.Model.Organizadores;
import br.inatel.Model.Eventos;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("1) Fazer evento");
//        System.out.println("2) Buscar um evento");
//        System.out.println("3) Atualizar evento");
//        System.out.println("4) Excluir um evento");
//        System.out.println("5) Encerrar programa");

        Organizadores o1 = new Organizadores(1, "Joao", "3422-8900");
        Organizadores o2 = new Organizadores(2, "Joa", "3423-8900");
        Organizadores o3 = new Organizadores(3, "Jo", "3323-8900");

        Eventos e1 = new Eventos(1, "Jutel", "11/11/2011", "Inatel", 500, 300, 1);
        Eventos e2 = new Eventos(2, "Carnavel", "12-12-2012", "Inatel", 2000, 700, 2);
        Eventos e3 = new Eventos(3, "Festa dos Alunos", "07-08-2013", "Ginásio Inatel", 440, 200, 3);

        int opcao = 0;

        System.out.println();
        System.out.println("--- BEM VINDO AO SISTEMA DE GESTÃO DE EVENTOS ---");
        System.out.println("Entre com as informações do organizador do evento. ");
        System.out.print("- ID: ");
        int IDauxOrg = scanner.nextInt();
        scanner.nextLine();
        System.out.print("- Nome: ");
        String nomeOrganizador = scanner.nextLine();
        System.out.print("- Contato: ");
        String contatoOrganizador = scanner.nextLine();

        System.out.println();
        System.out.println("---- Menu ----");
        System.out.println("1) Criar evento");
        System.out.println("2) Buscar um evento");
        System.out.println("3) Atualizar evento");
        System.out.println("4) Excluir um evento");
        System.out.println("5) Encerrar programa");
        Organizadores o4 = new Organizadores(IDauxOrg, nomeOrganizador, contatoOrganizador);
        OrganizadoresDAO o4DAO = new OrganizadoresDAO();
        o4DAO.insertOrganizadores(o4);

        do {
            int IDauxEv = 0;
            System.out.println("Escolha uma opção do menu: ");
            try {
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido!");
                scanner.next(); // Limpa o buffer
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Entre com as informações do evento. ");
                    System.out.println("- ID do evento: ");
                    IDauxEv = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("- Nome do evento: ");
                    String nomeEvento = scanner.nextLine();
                    System.out.println("- Data: ");
                    String dataEvento = scanner.nextLine();
                    System.out.println("- Local: ");
                    String localEvento = scanner.nextLine();
                    System.out.println("- Capacidade: ");
                    int capacidadeEvento = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("- Ingressos disponíveis: ");
                    int ingressosDisponiveisEvento = scanner.nextInt();
                    scanner.nextLine();
                    // Ingressos que foram vendidos
                    int ingressosVendidosEnvento = capacidadeEvento - ingressosDisponiveisEvento;


                  Eventos evento = new Eventos(IDauxEv, nomeEvento, dataEvento, localEvento, capacidadeEvento, ingressosVendidosEnvento, IDauxOrg);
                  EventosDAO eventoDAO1 = new EventosDAO();
                  eventoDAO1.insertEvento(evento);
                    System.out.println("Evento inserido com sucesso! ");
                    System.out.println();

                    break;
                case 2:
                    System.out.println("Buscar um evento. ");
                    System.out.print("- Digite o ID do evento que deseja buscar: ");
                    IDauxEv = scanner.nextInt();
                    scanner.nextLine();
                    EventosDAO eventoDAO2 = new EventosDAO();
                    eventoDAO2.selectEvento(IDauxEv);
                    break;
                case 3:
                    System.out.println("Atualizar evento. ");
                    System.out.print("- Digite o ID do evento que deseja atualizar: ");
                    IDauxEv = scanner.nextInt();
                    scanner.nextLine();
                    EventosDAO eventoDAO3 = new EventosDAO();
                    Eventos eventoAux = eventoDAO3.selectEvento(IDauxEv);

                    System.out.println("- Escolha a informação que quer atualizar (não é possível alterar ID do organizador, quantidade de ingressos vendidos e ID do evento): ");
                    System.out.println("1- Atualizar nome ");
                    System.out.println("2- Atualizar data ");
                    System.out.println("3- Atualizar local ");
                    System.out.println("4- Atualizar capacidade de pessoas ");
                    System.out.println("5- Atualizar ingressos disponíveis ");

                    int infoUpd = scanner.nextInt();
                    scanner.nextLine();

                    switch (infoUpd){
                        case 1:
                            System.out.print("Insira o novo nome do evento: ");
                            String nomeAux = scanner.nextLine();
                            eventoAux.setNome(nomeAux);
                            eventoDAO3.updateEvento(eventoAux);
                            break;
                        case 2:
                            System.out.print("Digite a nova data do evento: ");
                            String dataAux = scanner.nextLine();
                            eventoAux.setData(dataAux);
                            eventoDAO3.updateEvento(eventoAux);
                            break;
                        case 3:
                            System.out.print("Digite o novo local do evento: ");
                            String localAux = scanner.nextLine();
                            eventoAux.setLocal(localAux);
                            eventoDAO3.updateEvento(eventoAux);
                            break;
                        case 4:
                            System.out.print("Digite a nova capacidade: ");
                            int capacidadeAux = scanner.nextInt();
                            scanner.nextLine();
                            eventoAux.setCapacidade(capacidadeAux);
                            eventoDAO3.updateEvento(eventoAux);
                            break;
                        case 5:
                            System.out.println("Digite a quantidade nova de ingressos disponíveis: ");
                            int ingDisponiveis = scanner.nextInt();
                            scanner.nextLine();
                            eventoAux.setIngressos_disponiveis(ingDisponiveis);
                            eventoDAO3.updateEvento(eventoAux);
                            break;
                    }
                    System.out.println("Tabela com informações atualizadas: ");
                    eventoDAO3.selectEvento(IDauxEv);
                    break;
                case 4:
                    System.out.println("Excluir evento. ");
                    System.out.print("Digite o ID do evento que deseja excluir: ");
                    IDauxEv = scanner.nextInt();
                    scanner.nextLine();
                    EventosDAO eventoDAO4 = new EventosDAO();
                    eventoDAO4.selectEvento(IDauxEv);
                    eventoDAO4.deleteEvento(IDauxEv);
                    System.out.println("O evento selecionado foi deletado. ");
                    break;
                case 5:
                    System.out.println("Encerrando programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 5);


        //Nada aqui
        scanner.close();
    }
}