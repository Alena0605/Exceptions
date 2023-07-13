/*
ЗАДАЧА 4
1.  Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
    При подаче массива другого размера, необходимо бросить исключение MyArraySizeException.
2.  Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
    Если какой-то элемент массива преобразовать не удалось (например, в ячейке лежит символ или текст вместо числа),
    должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3.  В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и
    MyArrayDataException и вывести результат расчета
    (сумму элементов, при условии, что подали на вход корректный массив).
*/


package Seminar3.Task4;

public class Main {
    public static void main(String[] args) {
        String[][] array = new String[][]{{"1", "2", "3", "4"},
                {"9", "8", "7", "6"},
                {"1", "2", "3", "4"},
                {"9", "8", "7", "6"}};

        try {
            System.out.printf("Сумма элементов в массиве = %d\n", getSum(array));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getSum(String[][] array) throws Exception {
        int sum = 0;
        int arrayLen = array.length;

        if (arrayLen == 4) {
            for (int row = 0; row < arrayLen; row++) {
                if (arrayLen == array[row].length) {
                    for (int col = 0; col < array[row].length; col++) {
                        if (isNumeric(array[row][col])) {
                            sum += Integer.parseInt(array[row][col]);
                        } else {
                            throw new MyArrayDataException(row, col);
                        }
                    }
                } else {
                    throw new MyArraySizeException();
                }
            }
        } else {
            throw new MyArraySizeException();
        }
        return sum;
    }

    public static boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
