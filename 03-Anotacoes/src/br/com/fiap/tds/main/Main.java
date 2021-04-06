package br.com.fiap.tds.main;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.tds.annotation.Coluna;
import br.com.fiap.tds.bean.Aluno;
import br.com.fiap.tds.bean.Carro;

public class Main {

	public static void main(String[] args) {
		// Intanciar um Carro
		Carro carro = new Carro();

		// API de Reflection -> Obtem a estrutura da classe
		// Obrter o nome da classe
		String nome = carro.getClass().getName();
		System.out.println(nome);

		// Obter os métodos da classe
		Method[] metodos = carro.getClass().getDeclaredMethods();

		for (Method m : metodos) {
			System.out.println(m.getName());
		}
		
		System.out.println("Atributos: ");
		// Obter os atributos da Classe:
		Field[] atributos = carro.getClass().getDeclaredFields();

		// Exibir o nome e o tipo de dado
		for (Field field : atributos) {
			System.out.println(field.getName() + "| type -> " + field.getType());
			//Obter a anotação @Coluna
			Coluna anotacao = field.getAnnotation(Coluna.class);
			System.out.println(anotacao.nome() 
					+ " | Tipo: " + anotacao.tipo()
					+ " | Tamanho: " + anotacao.tamanho()
					+ " | PK: " + anotacao.pk());
		}
	}

}
