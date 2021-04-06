package br.com.fiap.tds.exception;

public class EnderecoNotfounException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EnderecoNotfounException() {
		super("Erro ao realizar consulta");
	}

	public EnderecoNotfounException(String message) {
		super(message);
	}
}
