package curso.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

    private Connection conexao;

    public int inserir(String sql, Object... atributos){
        try{
            PreparedStatement st = getCoxenao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            adicionarAtributos(st, atributos);

            if (st.executeUpdate() > 0){
                ResultSet resultado = st.getGeneratedKeys();

                if (resultado.next()){
                    return resultado.getInt(1);
                }
            }
            return -1;
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void close(){
        try {
            getCoxenao().close();
        } catch (SQLException e){

        } finally {
            conexao = null;
        }

    }

    private void adicionarAtributos(PreparedStatement st, Object[] atributos) throws SQLException {
        int indice = 1;
        for (Object atributo : atributos){
            if (atributo instanceof String){
                st.setString(indice, (String)atributo);
            } else if (atributo instanceof Integer) {
                st.setInt(indice, (Integer)atributo);
            }
            indice++;
        }
    }

    private Connection getCoxenao() throws SQLException {
        try {
            if(conexao != null && !conexao.isClosed()){
                return conexao;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        conexao = FactoryConnection.getConexao();
        return conexao;
    }

}
