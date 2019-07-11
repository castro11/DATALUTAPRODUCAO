package dataluta.ifsp.edu.br.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dataluta.ifsp.edu.br.dbconn.DbConnectionMySQL;
import dataluta.ifsp.edu.br.model.Usuario;

public class UsuarioDAO {

	DbConnectionMySQL dbConnectionMySQL = new DbConnectionMySQL();

    public boolean cadastroConta(Usuario us){
       String insertSPSQL = "call cadastroConta("+us.getCodLocal()+",'"+us.getNome()+"','"+us.getMunicipio()+"','"+us.getUf()+"','"+us.getNomeAssentamento()+"','"+us.getEmail()+"','"+us.getSenha()+"')";
       try {
           dbConnectionMySQL.executarSP(insertSPSQL);
           return true;
       } catch (SQLException ex) {
           ex.printStackTrace();
           return false;
       }
    	
    	
    	/* String insertSQL = "insert into USUARIO (CODASSENTAMENTO, NOME, MUNICIPIO, UF, ASSENTAMENTO, CODLOCAL, TIPOPRODUCAO, EMAIL, SENHA) values ("+assentamento.getCodAssentamento()+", '"+assentamento.getNome()+"', '"+assentamento.getMunicipio()+"', '"+assentamento.getUf()+"', '"+assentamento.getAssentamento()+"', "+assentamento.getCodLocal()+", '"+assentamento.getTipoProducao()+"', '"+assentamento.getEmail()+"', '"+assentamento.getSenha()+"')";
        try {
            dbConnectionMySQL.executarComando(insertSQL);
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }*/
    }
    
    public Usuario buscarConta(int codUsuario){
    	Usuario a = new Usuario();
        String findSQL = "select * from USUARIO where  = "+codUsuario;
        try {
            ResultSet resultados = dbConnectionMySQL.buscarRegistros(findSQL);
            while(resultados.next()){
                //a.setCodAssentamento(Integer.parseInt(resultados.getString("CODASSENTAMENTO")));
                //a.setCodLocal(Integer.parseInt(resultados.getString("CODLOCAL")));
                // fazer para todos os outros campos
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return a;
    }
    
    
    public ArrayList<Usuario> buscarTodosAssentamento(){
        ArrayList<Usuario> assentamentos = new ArrayList<Usuario>();
        String findSQL = "select * from ASSENTAMENTO";
        try {
            ResultSet resultados = dbConnectionMySQL.buscarRegistros(findSQL);
            while(resultados.next()){
                Usuario a = new Usuario();
               // a.setCodAssentamento(Integer.parseInt(resultados.getString("CODASSENTAMENTO")));
                //a.setCodLocal(Integer.parseInt(resultados.getString("CODLOCAL")));
                // fazer para todos os outros campos
                assentamentos.add(a);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return assentamentos;
    }
    
/*    public boolean atualizarAluno(Aluno aluno){
        String updateSQL = "update tb_aluno set " +
                " nome = '"+aluno.getNome()+"'," +
                " registro_academico = '"+aluno.getRegistroAcademico()+"'" +
                " where pk_aluno = "+aluno.getPkAluno();
        try {
            dbConnectionMySQL.executarComando(updateSQL);
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean deletarAluno(Aluno aluno){
        String deleteSQL = "delete tb_aluno where pk_aluno = "+aluno.getPkAluno();
        try {
            dbConnectionMySQL.executarComando(deleteSQL);
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public ArrayList<Aluno> buscarUmAluno(Aluno aluno){
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        String findSQL = "select * from tb_aluno where pk_aluno = "+aluno.getPkAluno();
        try {
            ResultSet resultados = dbConnectionMySQL.buscarRegistros(findSQL);
            while(resultados.next()){
                Aluno a = new Aluno();
                a.setPkAluno(Integer.parseInt(resultados.getString("pk_aluno")));
                a.setNome(resultados.getString("nome"));
                a.setNome(resultados.getString("registro_academico"));
                alunos.add(a);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return alunos;
    }

        public ArrayList<Aluno> buscarTodosAlunos(){
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        String findSQL = "select * from tb_aluno ";
        try {
            ResultSet resultados = dbConnectionMySQL.buscarRegistros(findSQL);
            while(resultados.next()){
                Aluno a = new Aluno();
                a.setPkAluno(Integer.parseInt(resultados.getString("pk_aluno")));
                a.setNome(resultados.getString("nome"));
                a.setNome(resultados.getString("registro_academico"));
                alunos.add(a);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return alunos;
    }
	*/
	
}
