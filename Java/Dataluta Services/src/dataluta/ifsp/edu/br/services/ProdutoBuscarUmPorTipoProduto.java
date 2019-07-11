package dataluta.ifsp.edu.br.services;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dataluta.ifsp.edu.br.dao.ProdutoDAO;
import dataluta.ifsp.edu.br.model.Produto;

/**
 * Servlet implementation class ProdutoBuscarUmPorTipoProduto
 */
public class ProdutoBuscarUmPorTipoProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ProdutoBuscarUmPorTipoProduto() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processsarRequisicao(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processsarRequisicao(request, response);
	}
	
	
	protected void processsarRequisicao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		String tipoProduto = request.getParameter("tipoProduto");
		
		ArrayList<Produto> produtos = produtoDAO.buscarTodosProdutoPorTipoProduto(tipoProduto);
		
		Gson gson = new Gson();
		String produtosJsonString = gson.toJson(produtos);
		
        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(produtosJsonString);
        out.flush(); 
	}

}
