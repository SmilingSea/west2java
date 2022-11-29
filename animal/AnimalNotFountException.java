package animal;

public class AnimalNotFountException extends RuntimeException {
    private double money;

    public AnimalNotFountException() {
    }

    public AnimalNotFountException(String message) {
        super(message);
    }

}
