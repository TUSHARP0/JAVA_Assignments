package CustomException;

@SuppressWarnings("serial")
public class EmpValidationException extends Exception {

	public EmpValidationException(String msg) {
		super(msg);
	}
}
