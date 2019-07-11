package dataluta.ifsp.edu.br.services;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataluta.ifsp.edu.br.dao.AssentamentoDAO;
import dataluta.ifsp.edu.br.model.Assentamento;

public class AssentamentoIncluirService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AssentamentoIncluirService() {
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
		
		/*assentamento.setNome(request.getParameter("txtNome"));
		assentamento.setMunicipio(request.getParameter("txtMunicipio"));
		assentamento.setUF(request.getParameter("txtUF"));
		assentamento.setAssentamento(request.getParameter("txtAssentamento"));
		assentamento.setCodLocal(request.getParameter("txtCodLocal"));
		assentamento.setTipoProducao(request.getParameter("txtTipoProducao"));
		assentamento.setEmail(request.getParameter("txtEmail"));
		assentamento.setSenha(request.getParameter("txtSenha"));
		
		
		try {
			assentamentoDAO.gravarAssentamento(assentamento);
			response.getWriter().println("<center>Sucesso!</center><br><center><a href=\"index.jsp\">Voltar</a></center>");
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}
	

}
