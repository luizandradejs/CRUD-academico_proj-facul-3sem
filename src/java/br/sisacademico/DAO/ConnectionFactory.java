package br.sisacademico.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    private static final String urlDB = "jdbc:derby://localhost:1527/sistemaAcademico";
    private static final String user = "uninove"; //usuário do Banco de Dados
    private static final String pass = "Senha123"; //Senha do banco de dados
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(urlDB, user, pass);
    }
    
}
