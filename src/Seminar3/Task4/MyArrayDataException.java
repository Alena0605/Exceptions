package Seminar3.Task4;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int row, int col) {
        super("Ошибка при попытке преобразовать значение в ячейке с индексами (" + row + ", " + col + ") в тип int!");
    }
}
