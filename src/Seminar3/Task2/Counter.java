package Seminar3.Task2;

import java.io.IOException;

public class Counter implements AutoCloseable {
    private int value;
    private boolean isOpen;

    public Counter(int value) {
        this.value = value;
        this.isOpen = true;
    }

    public void add() throws IOException {
        if (isOpen) {
            value++;
        } else {
            throw new IOException("Счётчик закрыт!");
        }
    }

    @Override
    public String toString() {
        return "Counter = " + value;
    }

    @Override
    public void close() {
        isOpen = false;
    }
}
