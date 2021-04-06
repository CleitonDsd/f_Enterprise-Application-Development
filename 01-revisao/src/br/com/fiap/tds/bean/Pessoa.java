package br.com.fiap.tds.bean;

public class Pessoa {

	private String nome;
	private int idade;
	private boolean deficiente;
	private Genero genero;

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public void cadastrar() {
		System.out.println("Cadastrando uma pessoa...");
	}

	public void cadastrar(String nome) {
		System.out.println("Cadastrando o nome: " + nome);
	}

	public void cadastrar(String nome, int idade) {
		System.out.println("Cadastrando nome: " + nome + " e idade: " + idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isDeficiente() {
		return deficiente;
	}

	public void setDeficiente(boolean deficiente) {
		this.deficiente = deficiente;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

}
