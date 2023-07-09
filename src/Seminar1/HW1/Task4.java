// ЗАДАЧА 4
// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
//
// Важно:
// При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.


package Seminar1.HW1;

public class Task4 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{49, 64, 35, 125, 11};
        int[] arr2 = new int[]{7, 8, 5, 25, 11};
        try {
            int[] result = getArrayDivision(arr1, arr2);
            printArray(result);
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int[] getArrayDivision(int[] array1, int[] array2) throws RuntimeException {
        if (array1 != null && array2 != null) {
            if (array1.length == array2.length) {
                int[] arrayDiv = new int[array1.length];
                for (int i = 0; i < array1.length; i++) {
                    if (array2[i] != 0) {
                        arrayDiv[i] = array1[i] / array2[i];
                    } else {
                        throw new RuntimeException("ОШИБКА! Деление на 0!");
                    }
                }
                return arrayDiv;
            } else {
                throw new RuntimeException("ОШИБКА! Длины массивов не равны!");
            }
        } else {
            throw new RuntimeException("ОШИБКА! Один или оба массива пусты!");
        }
    }

    public static void printArray(int[] array) {
        for (int el : array) {
            System.out.printf("%d ", el);
        }
        System.out.println();
    }
}
