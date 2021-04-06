package br.com.fiap.tds.main;

import br.com.fiap.tds.bean.Funcionario;
import br.com.fiap.tds.dao.FuncionarioDAO;
import br.com.fiap.tds.dao.FuncionarioOracleDao;

public class TesteInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instanciar um objeto do tipo FuncionarioDAO
		FuncionarioDAO dao = new FuncionarioOracleDao();
		
		//Chamar o metódo de atualizar
		dao.atualizar(new Funcionario());
	}

}
