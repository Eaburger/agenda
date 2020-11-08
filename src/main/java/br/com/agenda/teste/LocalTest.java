package br.com.agenda.teste;

import br.com.agenda.DAO.LocalDAO;

import java.sql.SQLException;

public class LocalTest {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
		
		LocalDAO dao  = new LocalDAO();
		System.out.println(dao.listarTudo());
	}

}
