package br.com.fiap.tds.main;

import br.com.fiap.tds.bean.Aluno;
import br.com.fiap.tds.bean.Carro;
import br.com.fiap.tds.orm.Orm;

public class Exercicio {
	public static void main(String[] args) {
		// Instanciar um Carro e um Aluno
		Carro carro = new Carro();
		Aluno aluno = new Aluno();

		// Instanciar um ORM
		Orm orm = new Orm();

		// Chamar
		System.out.println(orm.gerarPesquisa(aluno));
		System.out.println(orm.gerarPesquisa(carro));

	}
}
