package teste;

import teste.DAO.UsuarioDAO;
import teste.conexao.Conexao;
import teste.entidades.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("luan");
        pessoa1.setNascimento(15/14/1994);
        pessoa1.setSexo("F");
        pessoa1.setPeso(79.7);
        pessoa1.setAltura(1.98);
        pessoa1.setNacionalidade("brasil");

        new UsuarioDAO().cadastrarPessoa(pessoa1);
    }
}