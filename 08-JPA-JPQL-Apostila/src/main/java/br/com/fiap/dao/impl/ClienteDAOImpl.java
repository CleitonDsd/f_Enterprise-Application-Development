package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Reserva;

public class ClienteDAOImpl extends GenericDAOImpl<Cliente, Integer> implements ClienteDAO {

	public ClienteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Cliente> buscarPorNome(String nome) {

		TypedQuery<Cliente> query = em.createQuery("from Cliente c where c.nome like :n", Cliente.class);

		query.setParameter("n", "%" + nome + "%");

		return query.getResultList();
	}

	@Override
	public List<Cliente> buscarClientePorEstado(String estado) {

		return em.createQuery("from Cliente c where c.endereco.cidade.uf = :es", Cliente.class)
				.setParameter("es", estado).getResultList();

	}

	@Override
	public List<Cliente> buscaPorDiasReservas(int dias) {
		return em.createQuery("select r.cliente from Reserva r where r.numeroDias = :dias", Cliente.class)
				.setParameter("dias", dias)
				.getResultList();
	}

}
