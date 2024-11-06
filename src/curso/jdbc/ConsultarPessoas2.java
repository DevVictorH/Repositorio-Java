package curso.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
    public static void main(String[] args) throws SQLException {

        Scanner ler = new Scanner(System.in);

        Connection conexao = FactoryConnection.getConexao();
        String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";

        System.out.print("Informe a letra do nome: ");
        String letra = ler.nextLine();

        PreparedStatement st = conexao.prepareStatement(sql);
        st.setString(1, "%" + letra + "%");
        ResultSet resultado = st.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()){
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for(Pessoa p : pessoas){
            System.out.println(p.getCodigo() + " - " +p.getNome());
        }

        st.close();
        ler.close();

    }
}
