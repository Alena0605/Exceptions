// ЗАДАЧА 3
// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.


package Seminar1.HW1;

public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{49, 64, 35, 79, 11};
        int[] arr2 = new int[]{27, 58, 89, 13, 7};
        try {
            int[] result = getArraySubtraction(arr1, arr2);
            printArray(result);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int[] getArraySubtraction(int[] array1, int[] array2) {
        if (array1 != null && array2 != null) {
            if (array1.length == array2.length) {
                int[] arraySub = new int[array1.length];
                for (int i = 0; i < array1.length; i++) {
                    arraySub[i] = array1[i] - array2[i];
                }
                return arraySub;
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
