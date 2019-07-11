package dataluta.ifsp.edu.br.services;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataluta.ifsp.edu.br.dao.UsuarioDAO;
import dataluta.ifsp.edu.br.model.Usuario;

public class CadastroContaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CadastroContaUsuario() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processsarRequisicao(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processsarRequisicao(request, response);
	}

	
	protected void processsarRequisicao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario user = new Usuario();
		UsuarioDAO userDAO =  new UsuarioDAO();
		
		user.setCodLocal(Integer.parseInt(request.getParameter("codlocal")));
		user.setNome(request.getParameter("nome"));
		user.setMunicipio(request.getParameter("municipio"));
		user.setUf(request.getParameter("uf"));
		user.setNomeAssentamento(request.getParameter("nomeassentamento"));
		user.setEmail(request.getParameter("email"));
		user.setSenha(request.getParameter("senha"));
		
		try {
			userDAO.cadastroConta(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
