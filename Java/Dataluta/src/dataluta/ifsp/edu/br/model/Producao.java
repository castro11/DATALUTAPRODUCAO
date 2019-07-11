package dataluta.ifsp.edu.br.model;

public class Producao {
	private int codProducao;
	private String qualidadeProducao;
	private int quantidadeProducao;
	private int codProduto_producao;
	private int codAssentamento_producao;
	
	
	public int getCodProducao() {
		return codProducao;
	}
	public void setCodProducao(int codProducao) {
		this.codProducao = codProducao;
	}
	public String getQualidadeProducao() {
		return qualidadeProducao;
	}
	public void setQualidadeProducao(String qualidadeProducao) {
		this.qualidadeProducao = qualidadeProducao;
	}
	public int getQuantidadeProducao() {
		return quantidadeProducao;
	}
	public void setQuantidadeProducao(int quantidadeProducao) {
		this.quantidadeProducao = quantidadeProducao;
	}
	public int getCodProduto_Producao() {
		return codProduto_producao;
	}
	public void setCodProduto_Producao(int codProduto_producao) {
		this.codProduto_producao = codProduto_producao;
	}
	public int getCodAssentamento_Producao() {
		return codAssentamento_producao;
	}
	public void setCodAssentamento_Producao(int codAssentamento_producao) {
		this.codAssentamento_producao = codAssentamento_producao;
	}

}
