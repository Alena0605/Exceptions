/*
ЗАДАЧА №2
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения:
- метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
- в каждой ячейке может лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
*/


package Seminar1;

public class Task2 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        System.out.println(getSum(arr));
    }

    public static int getSum(int[][] array) {
        int sum = 0;

        for (int[] row : array) {
            if (array.length != row.length) {
                throw new RuntimeException("Матрица не квадратная!");
            }
            for (int col : row) {
                if (col == 0 || col == 1) {
                    sum += col;
                } else {
                    throw new RuntimeException("Недопустимое значение в матрице!");
                }
            }
        }
        return sum;
    }
}
