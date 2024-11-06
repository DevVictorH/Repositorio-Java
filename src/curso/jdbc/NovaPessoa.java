package curso.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = ler.next();

        Connection conexao = FactoryConnection.getConexao();

        String sql = "INSERT INTO pessoas(nome) VALUES(?)";
        PreparedStatement st = conexao.prepareStatement(sql); // tecnica para evitar sql injection
        st.setString(1, nome); // passar a posição do parâmetro e o nome do parâmetro
        st.execute();

        System.out.println("Pessoa incluida com sucesso!");
        ler.close();

    }
}
