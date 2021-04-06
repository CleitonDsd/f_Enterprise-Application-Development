package br.com.fiap.tds.dao;

import br.com.fiap.tds.exception.CommitException;
import br.com.fiap.tds.exception.EntityNotFoundException;

//GenericDAO<Entidade, Chave> dao = ... 

public interface GenericDAO<E, K> {

	void create(E entidade);

	E search(K id) throws EntityNotFoundException;

	void update(E entidade);

	void delete(K id) throws EntityNotFoundException;

	void commit() throws CommitException;
}
