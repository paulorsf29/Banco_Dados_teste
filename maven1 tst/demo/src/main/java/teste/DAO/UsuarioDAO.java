package teste.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import teste.conexao.Conexao;
import teste.entidades.Pessoa;

public class UsuarioDAO {
    public void cadastrarPessoa(Pessoa pessoa){
        String sql = "insert into pessoa(nome,nascimento,sexo,peso,altura,nacionalidade) value(?,?,?,?,?,?)";

        PreparedStatement cadastro = null;
        try {
            cadastro = Conexao.getConnection().prepareStatement(sql);

            cadastro.setString(1, pessoa.getNome());
            cadastro.setInt(2, pessoa.getNascimento());
            cadastro.setString(3, pessoa.getSexo());
            cadastro.setDouble(4, pessoa.getPeso());
            cadastro.setDouble(5, pessoa.getAltura());
            cadastro.setString(6, pessoa.getNacionalidade());

            cadastro.execute();
            cadastro.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
