package com.Rh.exception;

public class ValidarException extends RuntimeException{
    private static final long SerialVersionUid = 1L;

    public ValidarException (String mensagem) {
        super(mensagem);
    }
}
