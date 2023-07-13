/*
ЗАДАЧА 2
Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1.
Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources.
Нужно бросить исключение, если работа с объектом типа счетчик была не в ресурсном try и/или ресурс остался открыт.
Подумайте, какой тип исключения подойдет лучше всего.
*/


package Seminar3.Task2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (Counter counter = new Counter(0)) {
            counter.add();
            counter.add();
            counter.add();
            System.out.println(counter);
            counter.close();
            counter.add();
        }
    }
}
