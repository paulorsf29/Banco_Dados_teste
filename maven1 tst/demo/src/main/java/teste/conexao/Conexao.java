package teste.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    private static String url = "jdbc:mysql://localhost:3306/cadastro";
    private static String user = "root";
    private static String senha = "teste";

    private static Connection conn;

    public static Connection getConnection(){
        try {
            if (conn == null) {
            conn = DriverManager.getConnection(url, user, senha);
            return conn;
        } else {
            return conn;
        }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        }
        
    }
}
