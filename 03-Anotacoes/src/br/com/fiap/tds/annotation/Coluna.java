package br.com.fiap.tds.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Teste.java - compilar (javac) Teste.class(bytecode) -> interpretado JVM (Executável);

//Definir o lugar que a anotação pode ser utilizada
//FIELD -> atributos
@Target({ ElementType.FIELD, ElementType.METHOD })

//Definir até quando a anotação estará presente
//SOURCE -> até o código (.java)
//CLASS -> até o bytecode (.class)
//RUNTIME -> até a execução
@Retention(RetentionPolicy.RUNTIME)
public @interface Coluna {

	String nome();

	String tipo();

	boolean pk() default false;

	int tamanho() default 255;

}
