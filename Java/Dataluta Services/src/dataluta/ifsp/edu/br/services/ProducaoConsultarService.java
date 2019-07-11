package dataluta.ifsp.edu.br.services;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataluta.ifsp.edu.br.dao.ProducaoDAO;
import dataluta.ifsp.edu.br.model.Producao;

public class ProducaoConsultarService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProducaoConsultarService() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processsarRequisicao(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processsarRequisicao(request, response);
	}
	
	
	protected void processsarRequisicao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Producao producao = new Producao();
		ProducaoDAO producaoDAO = new ProducaoDAO();
		
	}
	

}
