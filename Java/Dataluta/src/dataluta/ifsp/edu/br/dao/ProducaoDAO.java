package dataluta.ifsp.edu.br.dao;

import java.sql.SQLException;

import dataluta.ifsp.edu.br.dbconn.DbConnectionMySQL;
import dataluta.ifsp.edu.br.model.Producao;

public class ProducaoDAO {

	DbConnectionMySQL dbConnectionMySQL = new DbConnectionMySQL();

    public boolean gravarProducao(Producao producao){
        String insertSQL = "insert into PRODUCAO (CODPRODUCAO, QUALIDADEPRODUCAO, QUANTIDADEPRODUCAO, CODPRODUTO_PRODUCAO, CODASSENTAMENTO_PRODUCAO) values ("+producao.getCodProducao()+",'"+producao.getQualidadeProducao()+"', "+producao.getQuantidadeProducao()+", "+producao.getCodProduto_Producao()+", "+producao.getCodAssentamento_Producao()+")";
        try {
            dbConnectionMySQL.executarComando(insertSQL);
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
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
