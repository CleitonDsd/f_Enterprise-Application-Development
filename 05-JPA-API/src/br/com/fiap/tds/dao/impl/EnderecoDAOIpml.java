package br.com.fiap.tds.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.tds.bean.Endereco;
import br.com.fiap.tds.dao.EnderecoDAO;
import br.com.fiap.tds.exception.CommitException;
import br.com.fiap.tds.exception.EnderecoNotfounException;

public class EnderecoDAOIpml implements EnderecoDAO {

	private EntityManager em;

	public EnderecoDAOIpml(EntityManager em) {
		this.em = em;
	}

	@Override
	public void create(Endereco endereo) {
		em.persist(endereo);
	}

	@Override
	public Endereco search(int id) throws EnderecoNotfounException {
		Endereco endereco = em.find(Endereco.class, id);
		if (endereco == null)
			throw new EnderecoNotfounException();
		return endereco;
	}

	@Override
	public void update(Endereco endereco) {
		em.merge(endereco);
	}

	@Override
	public void delete(int id) throws EnderecoNotfounException {
		Endereco endereco = search(id);
		em.remove(endereco);
	}

	@Override
	public void commit() throws CommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new CommitException();
		}
	}

}
