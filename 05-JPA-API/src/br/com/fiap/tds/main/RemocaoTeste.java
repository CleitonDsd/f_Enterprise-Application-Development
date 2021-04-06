package br.com.fiap.tds.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.tds.bean.Endereco;

public class RemocaoTeste {

	public static void main(String[] args) {
		// Oter a fabrica e o entity manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();

		// Pesquisar o endereço que será removido
		Endereco endereco = em.find(Endereco.class, 1);

		// Chamar o metódo remove (Marcar o endereco com o status removed)
		em.remove(endereco);

		// Commit
		em.getTransaction().begin();
		em.getTransaction().commit();

		System.out.println("Endereço Removido");

		// Fechar
		em.close();
		fabrica.close();
	}

}
