package br.com.fiap.tds.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.fiap.tds.bean.Funcionario;

public class TesteColecao {

	public static void main(String[] args) {

		// Criando dois funcion�rios
		Funcionario funcionario1 = new Funcionario("Cleiton", 20);
		Funcionario funcionario2 = new Funcionario("Morena", 19);

		// Criar uma lista de funcion�rio
		List<Funcionario> funcionarios = new ArrayList<>();

		// Adicionar os dois funcion�rios a lista
		funcionarios.add(funcionario1);
		funcionarios.add(funcionario2);

		// for each
		for (Funcionario funcionario : funcionarios) {
			// System.out.println(funcionario.getNome());
			System.out.println(funcionario.toString());
		}

		// Mapa
		Map<String, Funcionario> mapa = new HashMap<String, Funcionario>();

		// Adicionar dois funcion�rios no mapa
		mapa.put("F1", new Funcionario("Morena", 19));
		mapa.put("F2", new Funcionario("Cleiton", 20));

		// Recuperar o funcion�rio atrav�s da chave
		funcionario1 = mapa.get("F1");
		System.out.println(funcionario1.getNome() + " | idade: " + funcionario1.getIdade());

	}

}
