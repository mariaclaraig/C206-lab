package br.inatel.DAO;

import java.sql.*;

public abstract class ConnectionDAO {

    Connection con; //conexão
    PreparedStatement pst; //declaração(query) preparada - código em sql
    Statement st; //declaração(query) - código em sql
    ResultSet rs; //resposta do banco

    String database = "GestaoDeEventos"; //nome do BD
    String user = "root";
    String password = "@Santarosa0103";
//    String url = "jdbc:mysql://localhost:3306/" + database ;
    String url = "jdbc:mysql://localhost:3306/" + database
        + "?useTimezone=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";



    public void connectToDb() {
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println();
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        }
    }
}