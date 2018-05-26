package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    private static final String URL = "jdbc:mysql://localhost/SISTEMA_HOSPITALAR";
    private static final String USUARIO = "root";
    private static final String SENHA = "";       
    
    public static Connection getConnection() {
        

        try {
            Connection connection = null;
            connection = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("[INFO] Banco de Dados conectado com sucesso!");
            return connection;
            
        } catch (SQLException e) {
            System.out.println("Ocorreu um erro de SQL. Erro: " + e.getMessage());
        } 
        
        return null;
    }
}
