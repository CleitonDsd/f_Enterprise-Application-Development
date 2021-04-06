package br.com.fiap.tds.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.tds.bean.Endereco;

public class PesquisaTeste {

	public static void main(String[] args) {
		// Obter a f�brica e o entity manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();

		// Pesquisa o endere�o de c�digo 1
		Endereco endereco = em.find(Endereco.class, 1);

		// Exibir os dados do endere�o
		System.out.println(endereco.toString());

		endereco.setLogradouro("Av Paulista");
		em.getTransaction().begin();
		em.getTransaction().commit();

		// Fechar
		em.close();
		fabrica.close();
	}

}
