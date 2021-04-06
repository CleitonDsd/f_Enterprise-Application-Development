package br.com.fiap.tds.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.tds.bean.Endereco;

public class RefreshTeste {

	public static void main(String[] args) {

		// Obter a fábrica e o entity managaer
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();

		// Pesquisar o endereço de código 1
		Endereco endereco = em.find(Endereco.class, 1);

		// Exibir os dados
		System.out.println(endereco.toString());

		// Setar os valores do número e logradouro (no objeto)
		endereco.setNumero(2021);
		endereco.setLogradouro("Avenida do Estado");

		// Exibir os dados
		System.out.println(endereco.toString());

		// Refresh
		em.refresh(endereco);

		// Exibir os dados
		System.out.println(endereco.toString());

		// Fechar
		em.close();
		fabrica.close();
	}

}
