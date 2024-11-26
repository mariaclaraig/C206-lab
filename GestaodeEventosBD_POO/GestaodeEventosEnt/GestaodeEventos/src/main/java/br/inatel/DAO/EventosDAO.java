package br.inatel.DAO;

import br.inatel.Model.Eventos;

import java.sql.*;

import java.util.ArrayList;

public class EventosDAO extends ConnectionDAO {


    public boolean insertEvento(Eventos evento) {
        connectToDb();

        boolean sucesso;
        String sql = "INSERT INTO Eventos (id_eventos, nome, data, local, capacidade, ingressos_disponiveis, ingressos_vendidos, organizadores_id_organizador) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, evento.getId_evento());
            pst.setNString(2, evento.getNome());
            pst.setString(3, evento.getData());
            pst.setString(4, evento.getLocal());
            pst.setInt(5, evento.getCapacidade());
            pst.setInt(6, evento.getIngressos_disponiveis());
            pst.setInt(7, evento.getIngressos_vendidos());
            pst.setInt(8, evento.getOrganizadores_id_organizador());
            pst.execute();
            sucesso = true;
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    public boolean updateEvento(Eventos evento) {
        connectToDb();

        boolean sucesso;
        String sql = "UPDATE Eventos SET nome = ?, data = ?, local = ?, capacidade = ?, ingressos_disponiveis = ?, ingressos_vendidos = ?, organizadores_id_organizador = ? WHERE id_eventos = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, evento.getNome());
            pst.setString(2, evento.getData());
            pst.setString(3, evento.getLocal());
            pst.setInt(4, evento.getCapacidade());
            pst.setInt(5, evento.getIngressos_disponiveis());
            pst.setInt(6, evento.getIngressos_vendidos());
            pst.setInt(7, evento.getOrganizadores_id_organizador());
            pst.setInt(8, evento.getId_evento()); // Índice ajustado
            pst.execute();
            sucesso = true;
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    public boolean deleteEvento(int id) {
        connectToDb();

        boolean sucesso;
        String sql = "DELETE FROM Eventos WHERE id_eventos = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            sucesso = true;
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }


    public Eventos selectEvento(int id) {
        connectToDb(); // Certifique-se de que o método connectToDb está funcionando corretamente

        Eventos eventos = new Eventos();
        String sql = "SELECT * FROM Eventos WHERE id_eventos = ?";

        try {
            // Use apenas o PreparedStatement para configurar e executar a consulta
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery(); // Execute diretamente o PreparedStatement

            while (rs.next()) {
                Eventos eventoAux = new Eventos(
                        rs.getInt("id_eventos"),
                        rs.getString("nome"),
                        rs.getString("data"),
                        rs.getString("local"),
                        rs.getInt("capacidade"),
                        rs.getInt("ingressos_disponiveis"),
                        rs.getInt("Organizadores_id_organizador")
                );

                int INGRESSOS_VENDIDOS_AUX =  eventoAux.getCapacidade() - eventoAux.getIngressos_disponiveis();
                System.out.println("   Id: " + eventoAux.getId_evento());
                System.out.println("   Nome: " + eventoAux.getNome());
                System.out.println("   Data: " + eventoAux.getData());
                System.out.println("   Local: " + eventoAux.getLocal());
                System.out.println("   Capacidade: " + eventoAux.getCapacidade());
                System.out.println("   Ingressos Disponíveis: " + eventoAux.getIngressos_disponiveis());
                System.out.println("   Ingressos Vendidos: " + INGRESSOS_VENDIDOS_AUX);
                System.out.println("--------------------");

                eventos = eventoAux;
            }
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException exc) {
                System.out.println("Erro ao fechar os recursos: " + exc.getMessage());
            }
        }

        return eventos;
    }

}