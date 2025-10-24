package exam;

public class DuplicateTaskException extends Exception {
    private static final long serialVersionUID = 1L;

	public DuplicateTaskException(String message) {
        super(message);
    }
}