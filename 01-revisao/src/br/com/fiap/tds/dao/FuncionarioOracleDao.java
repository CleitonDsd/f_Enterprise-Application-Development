package br.com.fiap.tds.dao;

import br.com.fiap.tds.bean.Funcionario;

public class FuncionarioOracleDao implements FuncionarioDAO {

	@Override
	public void atualizar(Funcionario funcionario) {
		System.out.println("Atualizando do Oracle");

	}

	@Override
	public void deletar(int id) {
		System.out.println("Removendo do Oracle DB");

	}

}
