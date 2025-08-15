package br.com.dio.exception;

public class customException extends RuntimeException {
    public customException(String message, Throwable cause) {
        super(message, cause);
    }
}
