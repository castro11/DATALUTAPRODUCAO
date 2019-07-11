package dataluta.ifsp.edu.br.services;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataluta.ifsp.edu.br.dao.ProdutoDAO;
import dataluta.ifsp.edu.br.model.Produto;

public class ProdutoConsultarService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProdutoConsultarService() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processsarRequisicao(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processsarRequisicao(request, response);
	}
	
	
	protected void processsarRequisicao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Produto produto = new Produto();
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
	}
	

}
