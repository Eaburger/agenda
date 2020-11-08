package br.com.agenda.DAO;

import java.util.List;

public interface DaoGenerica {
	
	
	
	List<?> listarTudo();
	
	void excluir (Long id );

}
