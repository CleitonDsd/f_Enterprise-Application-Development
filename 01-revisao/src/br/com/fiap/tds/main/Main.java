package br.com.fiap.tds.main;

import br.com.fiap.tds.bean.Funcionario;
import br.com.fiap.tds.bean.Pessoa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciar uma pessoa
		Pessoa pessoa = new Pessoa();
		
		//Chamar o met�do cadastrar
		pessoa.cadastrar();
		
		//instanciar um funcion�rio 
		Funcionario funcionario = new Funcionario();
		
		//Chamar o met�do cadastrar()
		funcionario.cadastrar();
		
		//
		Pessoa p = new Funcionario();
		p.cadastrar();
	}

}
