/*
ЗАДАЧА №1
Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
Метод ищет в массиве заданное значение и возвращает его индекс.
При этом, например:
- если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
- если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
- если вместо массива пришел null, метод вернет -3.
- придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.

Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот метод запросит искомое число
у пользователя, вызовет первый, обработает возвращенное значение и покажет читаемый результат пользователю.
Например, если вернулось -2, пользователю выведется сообщение: “Искомый элемент не найден”.
*/


package Seminar1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(ui());
    }

    public static int findValue(int[] array, int value) {
        int minLength = 5;

        if (array == null) {
            return -3;
        } else if (array.length < minLength) {
            return -1;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    return i;
                }
            }
            return -2;
        }
    }

    public static String ui() {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        Scanner in = new Scanner(System.in);
        System.out.print("Введите искомое значение: ");
        int answer = in.nextInt();

        int result = findValue(arr, answer);

        switch (result) {
            case -1 -> {
                return "Длина массива меньше заданного минимума!";
            }
            case -2 -> {
                return "Элемент не найден!";
            }
            case -3 -> {
                return "Массив не заполнен!";
            }
            default -> {
                return "Искомый элемент в массиве имеет индекс " + result;
            }
        }
    }
}
