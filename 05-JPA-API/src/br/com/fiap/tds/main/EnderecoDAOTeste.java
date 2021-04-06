package br.com.fiap.tds.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.tds.bean.Endereco;
import br.com.fiap.tds.bean.TipoEndereco;
import br.com.fiap.tds.dao.impl.EnderecoDAOIpml;
import br.com.fiap.tds.exception.CommitException;
import br.com.fiap.tds.exception.EnderecoNotfounException;

public class EnderecoDAOTeste {

	public static void main(String[] args) {

		// Obter um entity manager;
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();

		// Instanciar um EnderecoDAO;
		EnderecoDAOIpml dao = new EnderecoDAOIpml(em);

		// Cadastrar um endereço
		Endereco endereco = new Endereco("01234", 31, "Av Paulista", true, TipoEndereco.CASA);
		try {
			dao.create(endereco);
			dao.commit();
			System.out.println("Endereço Registrado!");
		} catch (CommitException e) {
			System.err.println(e.getMessage());
		}

		// Pesquisar um endereço e exibir os dados;
		try {
			endereco = dao.search(1);
			System.out.println(endereco);
		} catch (EnderecoNotfounException e) {
			System.err.println(e.getMessage());
		}

		// Atualizar um endereço
		endereco = new Endereco(1, "5555", 31, "Av do Estado", true, TipoEndereco.COMERCIAL);
		try {
			dao.update(endereco);
			dao.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Remover um endereco;
		try {
			dao.delete(1);
			dao.commit();
			System.out.println("Endereço removido.");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		} catch (EnderecoNotfounException e) {
			System.out.println("Endereço não existe, não foi possível remover.");
		}
		// Fechar
	}

}
