package dataluta.ifsp.edu.br.services;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dataluta.ifsp.edu.br.dao.AssentamentoDAO;
import dataluta.ifsp.edu.br.model.Assentamento;


public class AssentamentoConsultarAllService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AssentamentoConsultarAllService() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processsarRequisicao(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processsarRequisicao(request, response);
	}
	
	
	protected void processsarRequisicao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AssentamentoDAO assentamentoDAO = new AssentamentoDAO();
		
		ArrayList<Assentamento> assentamentos  = assentamentoDAO.buscarTodosAssentamento();
		
		
		Gson gson = new Gson();
		String assentamentoJsonString = gson.toJson(assentamentos);
		
		/*String assentamentoJsonString = "";
		
		for(Assentamento as : assentamentos) {
			assentamentoJsonString += gson.toJson(as);
		}*/
	
 
        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(assentamentoJsonString);
        out.flush(); 
	}
	

}
