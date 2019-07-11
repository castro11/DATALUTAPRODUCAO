package dataluta.ifsp.edu.br.model;

public class Usuario {
    private int codUsuario;
    private String nome;
    private String municipio;
    private String uf;
    private String nomeAssentamento;
    private int codLocal;
    private String email;
    private String senha;


    public int getCodUsuario() {
        return codUsuario;
    }
    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMunicipio() {
        return municipio;
    }
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getNomeAssentamento() {
        return nomeAssentamento;
    }
    public void setNomeAssentamento(String nomeAssentamento) {
        this.nomeAssentamento = nomeAssentamento;
    }
    public int getCodLocal() {
        return codLocal;
    }
    public void setCodLocal(int codLocal) {
        this.codLocal = codLocal;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }


}
