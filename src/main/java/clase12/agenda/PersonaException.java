package clase12.agenda;

public class PersonaException extends Exception{

	public PersonaException() {
		super();
	}

	public PersonaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PersonaException(String message, Throwable cause) {
		super(message, cause);
	}

	public PersonaException(String message) {
		super(message);
	}

	public PersonaException(Throwable cause) {
		super(cause);
	}

}
