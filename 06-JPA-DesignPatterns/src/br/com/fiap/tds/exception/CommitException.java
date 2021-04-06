package br.com.fiap.tds.exception;

public class CommitException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CommitException() {
		super("Erro ao realizar o commit");
		// TODO Auto-generated constructor stub
	}

	public CommitException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
