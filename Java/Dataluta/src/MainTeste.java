import dataluta.ifsp.edu.br.dao.ProdutoDAO;
import dataluta.ifsp.edu.br.model.Produto;
import dataluta.ifsp.edu.br.dao.UsuarioDAO;
import dataluta.ifsp.edu.br.model.Usuario;
import dataluta.ifsp.edu.br.dao.ProducaoDAO;
import dataluta.ifsp.edu.br.model.Producao;

public class MainTeste {

	public static void main(String[] args) {
		Usuario a = new Usuario();
		UsuarioDAO aDAO = new UsuarioDAO();
		
		a.setNome("Vinicius");
		a.setMunicipio("Campinas");
		a.setUf("SP");
		a.setCodLocal(10254);
		a.setEmail("vinicius.almeida");
		a.setSenha("s123456");
		a.setNomeAssentamento("IFSP Asse");
		
		aDAO.cadastroConta(a);
		
		
		System.out.println("EXECUTADO");
	}

}
