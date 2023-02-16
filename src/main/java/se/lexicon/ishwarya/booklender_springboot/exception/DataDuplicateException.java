package se.lexicon.ishwarya.booklender_springboot.exception;

public class DataDuplicateException extends RuntimeException {

    public DataDuplicateException(String message) {
        super(message);
    }
}
