package br.com.fiap.tds.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.com.fiap.tds.bean.Endereco;
import br.com.fiap.tds.bean.TipoEndereco;

public class CadastroTeste {

	public static void main(String[] args) {

		// Obter uma fabrica e um entity manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();

		// Instanciar um endereço sem o código
		Endereco endereco = new Endereco("05569010", 1222, "Av Lins de Vasconelos", true, TipoEndereco.COMERCIAL);

		// Coloca o endereço no contexto do Entity Manager (gerenciado)
		em.persist(endereco);

		// Iniciar uma transação
		em.getTransaction().begin();

		// Commit
		em.getTransaction().commit();

		System.out.println("--- Registro Inserido ----");

		endereco.setNumero(300);
		em.getTransaction().begin();
		em.getTransaction().commit();

		em.close();
		fabrica.close();

	}

}
