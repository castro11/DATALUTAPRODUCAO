package dataluta.ifsp.edu.br.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dataluta.ifsp.edu.br.dao.AssentamentoDAO;
import dataluta.ifsp.edu.br.model.Assentamento;


public class AssentamentoConsultarService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AssentamentoConsultarService() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processsarRequisicao(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processsarRequisicao(request, response);
	}
	
	
	protected void processsarRequisicao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Assentamento assentamento = new Assentamento();
		AssentamentoDAO assentamentoDAO = new AssentamentoDAO();
		
		int codAssentamento = 0;
		codAssentamento = Integer.parseInt(request.getParameter("codAssentamento"));
		
		assentamento = assentamentoDAO.buscarUmAssentamento(codAssentamento);
		
		Gson gson = new Gson();
		String assentamentoJsonString = gson.toJson(assentamento);
		
		PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(assentamentoJsonString);
        out.flush();
	}
	

}