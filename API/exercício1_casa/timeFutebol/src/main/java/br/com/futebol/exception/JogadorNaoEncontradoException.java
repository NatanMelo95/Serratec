package br.com.futebol.exception;

public class JogadorNaoEncontradoException extends Exception{

	public JogadorNaoEncontradoException() {
		super("Jogador não encontrado.");
	}

	public JogadorNaoEncontradoException(String message) {
		super(message);
	}
	
}
