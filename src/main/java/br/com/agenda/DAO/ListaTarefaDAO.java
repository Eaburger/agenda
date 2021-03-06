package br.com.agenda.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;


import br.com.agenda.data.Conexao;
import br.com.agenda.data.ConexaoMySql;


public class ListaTarefaDAO {
	
	private final Conexao conexao;
	public ListaTarefaDAO() throws ClassNotFoundException, SQLException {
		this.conexao = new ConexaoMySql();
		
	}
	
	public void insert(	String descricao,String observacao,int local_id,int usuario_id) throws SQLException {
		
		String sql = "insert into lista_tarefa(descricao,observacao,local_id,usuario_id) values (?,?,?,?)";
		try {
			PreparedStatement stmt = this.conexao.getConnection().prepareStatement(sql);
			stmt.setString(1, descricao);
			stmt.setString(2, observacao);
			stmt.setLong(3, local_id);
			stmt.setLong(4, usuario_id);
			stmt.execute();
			this.conexao.commit();
			
		} catch (SQLException e){
			
			this.conexao.rollback();
			throw e;
		}
		
		
		
		
		
	}

}
