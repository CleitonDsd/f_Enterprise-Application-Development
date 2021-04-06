package br.com.fiap.tds.exception;

public class EntityNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EntityNotFoundException() {
		super("Entidade não encontrada");
		// TODO Auto-generated constructor stub
	}

	public EntityNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
