package ExceptionHandling;

public class AgeCheckException extends Exception {
    public AgeCheckException(String message) {
        super(message);
        System.out.println("yas hatasi alindi !!");
    }
}
