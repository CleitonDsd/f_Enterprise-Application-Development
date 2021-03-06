package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.CidadeDAO;
import br.com.fiap.entity.Cidade;

public class CidadeDAOImpl extends GenericDAOImpl<Cidade, Integer> implements CidadeDAO {

	public CidadeDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Cidade> listar() {
		// Criar a query
		TypedQuery<Cidade> query = em.createQuery("select s from Cidade s", Cidade.class);
		// Executar a query
		return query.getResultList();
	}

	@Override
	public List<Cidade> buscarPorDdd(int ddd) {

		// Criar query
		TypedQuery<Cidade> query = em.createQuery("from Cidade c where c.ddd = :numero", Cidade.class);
		
		//Setar o parametro
		query.setParameter("numero", ddd);
		
		return query.getResultList();
	}

}
