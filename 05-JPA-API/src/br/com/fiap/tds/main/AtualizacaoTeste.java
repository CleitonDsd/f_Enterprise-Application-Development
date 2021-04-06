package br.com.fiap.tds.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.tds.bean.Endereco;
import br.com.fiap.tds.bean.TipoEndereco;

public class AtualizacaoTeste {

	public static void main(String[] args) {
		// Obter a fabrica e o Entity Manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();

		// Instanciar um endereço com o código (Estado Detached)
		Endereco endereco = new Endereco(1, "39939393", 110, "Rua Olimpiadas", true, TipoEndereco.COMERCIAL);

		// Gerencia o objeto e atualiza no banco após o commit
		Endereco enderecoGerenciado = em.merge(endereco);

		//enderecoGerenciado.setAtivo(false);

		em.getTransaction().begin();
		em.getTransaction().commit();

		// fechar
		em.close();
		fabrica.close();

	}

}
