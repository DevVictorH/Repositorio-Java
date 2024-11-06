package curso.jdbc;

public class DAOTeste {
    public static void main(String[] args) {

        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome) VALUES(?)";
        dao.inserir(sql, "João da Silva");
        dao.inserir(sql, "Luiz Henrique");
        dao.inserir(sql, "Julia Pires ");

        dao.close();

    }
}
