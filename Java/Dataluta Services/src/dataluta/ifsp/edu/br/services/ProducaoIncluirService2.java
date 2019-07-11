package dataluta.ifsp.edu.br.services;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataluta.ifsp.edu.br.dao.ProducaoDAO;
import dataluta.ifsp.edu.br.model.Producao;


public class ProducaoIncluirService2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ProducaoIncluirService2() {
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
		
		
		producao.setQualidadeProducao(request.getParameter("txtQualidadeProducao"));
		producao.setQuantidadeProducao(Integer.parseInt(request.getParameter("txtQuantidadeProducao").toString()));
		producao.setCodProduto_Producao(Integer.parseInt(request.getParameter("txtCodProduto_Producao").toString()));
		
		try {
			producaoDAO.gravarProducao(producao);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
