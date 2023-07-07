/*
ЗАДАЧА №4
Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
Метод должен пройтись по каждому элементу и проверить, что он не равен null.
А теперь реализуйте следующую логику:
1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя.
2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”.
*/


package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, null, 4, null, 6};
        checkResult(arr);
    }

    public static List<Integer> checkArray(Integer[] arr) {
        List<Integer> nullIndexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                nullIndexes.add(i);
            }
        }
        return nullIndexes;
    }

    public static void checkResult(Integer[] array) {
        if (array == null) {
            System.out.println("Массив пустой!");
        } else {
            List<Integer> result = checkArray(array);
            if (result.size() != 0) {
                System.out.print("В массиве отсутствуют значения на позициях: ");
                for (int index : result) {
                    System.out.printf("%d ", index);
                }
                System.out.println();
            } else {
                System.out.println("Массив заполнен корректно.");
            }
        }
    }
}
