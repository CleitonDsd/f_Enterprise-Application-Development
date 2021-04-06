package br.com.fiap.tds.dao;

import br.com.fiap.tds.bean.Endereco;
import br.com.fiap.tds.exception.CommitException;
import br.com.fiap.tds.exception.EnderecoNotfounException;

// Interface -> desacoplar os objetos, diminuir a dependência
//View - Controller (EnderecoDAO) - DAO - Banco
public interface EnderecoDAO {

	// CRUD
	void create(Endereco endereo);

	Endereco search(int id) throws EnderecoNotfounException;

	void update(Endereco endereco);

	void delete(int id) throws EnderecoNotfounException;

	void commit() throws CommitException;
}
