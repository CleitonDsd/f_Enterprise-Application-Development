package br.com.fiap.tds.bean;

public class Funcionario extends Pessoa {

	public Funcionario() {
	}

	public Funcionario(String nome, int idade) {
		super(nome, idade);
	}

	// overwrite
	@Override
	public void cadastrar() {
		System.out.println("Cadastrando um funcionário...");
	}

	@Override
	public String toString() {
		return getNome() + " < | > " + getIdade();
	}
}
