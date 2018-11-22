package mysql_examples;

import java.sql.Connection;
import java.sql.DriverManager;

public class Banco {

    private String host = "jdbc:mysql://localhost:3306/example";
    private String user = "root";
    private String password = "vertrigo";
    private Connection conexao;
    
    public Banco() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection(host, user, password);
        } catch (Exception e) {
        }
    }
    
    public Connection getConnection(){//função para retornar a conexão
        return conexao;//retorna a conexão, que foi criada no método construtor
    }
    
}
