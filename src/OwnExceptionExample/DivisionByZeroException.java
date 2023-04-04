package OwnExceptionExample;

public class DivisionByZeroException extends ArithmeticException {
    public DivisionByZeroException(String s) {
        super(s);
    }
}
