package model.exceptions;

public class DomainException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	// Domain Exception = Exceção dentro do Domínio (Preferencia do Prof)
	// A classe de Exception pode herdar a classe Exception ou RuntimeException
	/* A diferença entre as duas, é que a Runtime não te obriga a tratar.
	 */
	
	public DomainException(String msg) {
		// Isso serve para permitir que eu instancie essa Exceção personalizada na superclasse
		super(msg);
	}
	
	
	
}
