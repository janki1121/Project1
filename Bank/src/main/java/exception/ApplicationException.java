package exception;

@SuppressWarnings("serial")
public class ApplicationException extends Exception {

	@Override
	public String getMessage() {
		return "Internal Database Server Error! Try again later!";
	}
}
