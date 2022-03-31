package br.com.diego.payrollapi.services.exeptions;

public class ObjectNotFoundExeption extends RuntimeException{

    public ObjectNotFoundExeption(String message) {
        super(message);
    }
}
