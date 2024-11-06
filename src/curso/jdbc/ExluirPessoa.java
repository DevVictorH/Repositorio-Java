package curso.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExluirPessoa {
    public static void main(String[] args) throws SQLException {

        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o id: ");
        int id = ler.nextInt();

        Connection conexao = FactoryConnection.getConexao();
        String sql = "DELETE FROM pessoas WHERE codigo = ?";

        PreparedStatement st = conexao.prepareStatement(sql);
        st.setInt(1, id);

        if(st.executeUpdate() > 0){
            System.out.println("Pessoa exluida com sucesso!");
        } else {
            System.out.println("Nenhuma linha afetada!");
        }

        st.close();
        ler.close();

    }
}
