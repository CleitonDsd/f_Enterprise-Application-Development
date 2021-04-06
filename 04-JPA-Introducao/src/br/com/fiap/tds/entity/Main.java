package br.com.fiap.tds.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {

		// Obter uma fabrica de Entity Manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");

		// Obter um objeto que gerencia as entidades EntityManager
		EntityManager em = fabrica.createEntityManager();

		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Cleiton");

		em.persist(funcionario);

		// fechar as conexões
		em.close();
		fabrica.close();
	}

}
