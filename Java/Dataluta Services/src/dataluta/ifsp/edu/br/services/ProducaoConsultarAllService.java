package dataluta.ifsp.edu.br.services;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dataluta.ifsp.edu.br.dao.ProducaoDAO;
import dataluta.ifsp.edu.br.model.Producao;


public class ProducaoConsultarAllService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 public ProducaoConsultarAllService() {
	        super();
	    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			processsarRequisicao(request, response);
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			processsarRequisicao(request, response);
		}
		
		
		protected void processsarRequisicao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			ProducaoDAO producaoDAO = new ProducaoDAO();
			
			ArrayList<Producao> producoes = producaoDAO.buscarTodosProducao();
			
			Gson gson = new Gson();
			String producaoJsonString = gson.toJson(producoes);
			
			PrintWriter out = response.getWriter();
	        response.setContentType("application/json");
	        response.setCharacterEncoding("UTF-8");
	        out.print(producaoJsonString);
	        out.flush(); 
			
		}

}
