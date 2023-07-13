package Seminar3.Task3;

public class NullPointerLinkedListException extends Exception {
    public NullPointerLinkedListException() {
        super("ОШИБКА! Попытка обращения к пустому элементу в связном списке!");
    }
}
