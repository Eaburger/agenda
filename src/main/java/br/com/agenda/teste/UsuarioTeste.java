package br.com.agenda.teste;

import java.sql.SQLException;

import br.com.agenda.DAO.UsuarioDAO;



public class UsuarioTeste {
	
	public static void main (String[] args) throws ClassNotFoundException,SQLException{
		
		//UsuarioDAO dao= new UsuarioDAO();
		
	//	LocalDAO teste = new LocalDAO();
		
	//	
	//	dao.inserir("Eduardo");
	//	teste.inserir("Angeloni");
		
        UsuarioDAO dao  = new UsuarioDAO();
		System.out.println(dao.listarTudo());
		
		
		
	}

}
