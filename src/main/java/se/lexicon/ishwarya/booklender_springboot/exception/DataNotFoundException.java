package se.lexicon.ishwarya.booklender_springboot.exception;

public class DataNotFoundException extends RuntimeException {

    public DataNotFoundException(String message) {
        super(message);
    }
}