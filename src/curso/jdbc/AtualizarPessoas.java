package curso.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoas {
    public static void main(String[] args) throws SQLException {

        Scanner ler = new Scanner(System.in);

        Connection conexao = FactoryConnection.getConexao();
        String sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        System.out.print("Informe o nome: ");
        String nome = ler.nextLine();

        System.out.print("Informe o id: ");
        int codigo = ler.nextInt();

        PreparedStatement st = conexao.prepareStatement(sql);
        st.setString(1, nome);
        st.setInt(2, codigo);
        st.executeUpdate();

        System.out.println("Pessoa alterado com sucesso!");

        st.close();
        ler.close();



    }
}
