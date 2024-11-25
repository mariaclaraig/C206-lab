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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Menu ---");
        Scanner scanner = new Scanner(System.in);

        System.out.println("1) Fazer inscrição");
        System.out.println("2) Buscar um inscrição");
        System.out.println("3) Atualizar inscrição");
        System.out.println("4) Excluir uma inscrição");
        System.out.println("5) Encerrar programa");

        List<Organizadores> organizadoresList1 = new ArrayList<>();
        Organizadores o1 = new Organizadores(1, "Joao", "3422-8900");
        Organizadores o2 = new Organizadores(2, "Joao", "3422-8900");
        Organizadores o3 = new Organizadores(3, "Joao", "3422-8900");
        organizadoresList1.add(o1);
        organizadoresList1.add(o2);
        organizadoresList1.add(o3);


        Eventos evento1 = new Eventos(0, "Jutel", "11-11-2011", "Inatel", 500, 300);
        //Eventos evento2 = new Eventos(1, "Carnavel", "12-12-2012", "Inatel", 2000, 700, organizadoresList1);
        //Eventos evento3 = new Eventos(2, "Festa dos Alunos", "07-08-2013", "Ginásio Inatel", 440, 200, organizadoresList1);


        EventosDAO eventoAuxiliar = new EventosDAO();

        evento1.setOrganizadoresList(organizadoresList1);

        for(Organizadores aux : organizadoresList1)
        {
            eventoAuxiliar.insertEvento(evento1, aux.getId_organizador());

            // INSERT INTO eventos VALUES ("Jutel", 1);
            // INSERT INTO eventos VALUES ("Jutel", 2);
            //

        }


        do {
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Entre com as informações de inscrição: ");

                    break;
                case 2:
                    System.out.println("caso 2");
                    break;
                case 3:
                    System.out.println("caso 3");
                    break;
                case 4:
                    System.out.println("caso 4");
                    break;

                case 5:
                    System.out.println("Encerrando conexão!");
                    break;
            }
        }while (scanner.nextInt() != 5);

        //Nada aqui
        scanner.close();
    }
}