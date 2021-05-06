package br.com.fiap.tds.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author Cleiton Dsd'
 *
 *         Classe que gerencia a �nica inst�ncia da EntityManagerFactory
 */
public class EntityManagerFactorySingleton {

	// 1 - Atributo est�tico que armazena a �nica inst�ncia
	private static EntityManagerFactory fabrica;

	// 2 - Construtor privado -> ningu�m consegue inst�nciar
	private EntityManagerFactorySingleton() {
	}

	// 3 - M�todo est�tico que retorna a �nica inst�ncia
	public static EntityManagerFactory getInstance() {

		// Validar se existe a f�brica
		if (fabrica == null) {
			fabrica = Persistence.createEntityManagerFactory("oracle");
		}
		return fabrica;
	}
}