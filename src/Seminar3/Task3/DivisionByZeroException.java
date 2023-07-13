package Seminar3.Task3;

public class DivisionByZeroException extends Exception {
    public DivisionByZeroException() {
        super("ОШИБКА! Попытка деления на 0!");
    }
}
