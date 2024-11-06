package curso.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306";
        String usuario = "root";
        String senha = "123321";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        System.out.println("Conexão efetuada com sucesso!");

        Statement st = conexao.createStatement();
        st.execute("CREATE DATABASE IF NOT EXISTS cursojava");
        System.out.println("Banco criado com sucesso!");

        conexao.close();

    }
}