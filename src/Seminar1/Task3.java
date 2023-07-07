/*
ЗАДАЧА №3
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения:
- метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
- в каждой ячейке может лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен вернуть код ошибки.
Программа должна корректно обработать код ошибки и вывести соответствующее сообщение пользователю.

Сравнить такой вариант обработки исключений с предыдущим.
Какое преимущество у исключений перед кодами ошибок вы можете назвать в данном случае?
*/


package Seminar1;

public class Task3 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int result = getSum(arr);
        checkSum(result);
    }

    public static int getSum(int[][] array) {
        int sum = 0;

        for (int[] row : array) {
            if (array.length != row.length) {
                return -1;
            }
            for (int col : row) {
                if (col == 0 || col == 1) {
                    sum += col;
                } else {
                    return -2;
                }
            }
        }
        return sum;
    }

    public static void checkSum(int answer) {
        switch (answer) {
            case -1 -> System.out.println("Матрица не квадратная!");
            case -2 -> System.out.println("Недопустимое значение в матрице!");
            default -> System.out.printf("Сумма значений в матрице равна %d\n", answer);
        }
    }
}
