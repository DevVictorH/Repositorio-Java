package curso.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabela {
    public static void main(String[] args) throws SQLException {

        Connection conexao = FactoryConnection.getConexao();

        String sql = """
                CREATE TABLE pessoas(
                codigo INT AUTO_INCREMENT PRIMARY KEY,
                nome VARCHAR(80) NOT NULL
                )
                     """;

        Statement st = conexao.createStatement();
        st.execute(sql);

        System.out.println("Tabela criada com sucesso!");
        conexao.close();
    }
}
