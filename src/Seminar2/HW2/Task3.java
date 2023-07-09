/*
ЗАДАЧА 3
Дан следующий код, исправьте его там, где требуется:
https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit
*/


package Seminar2.HW2;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(printDivision(a, b));
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(printSum(23, 234));

        int[] abc = new int[]{1, 2};
        if (abc.length > 3) {
            abc[3] = 9;
            System.out.println(Arrays.toString(abc));
        } else {
            System.out.println("ОШИБКА! Длина массива меньше 3.");
        }
    }

    public static int printSum(int a, int b) {
        return a + b;
    }

    public static double printDivision(int a, int b) {
        if (b != 0) {
            return (double) a / (double) b;
        } else {
            throw new ArithmeticException("ОШИБКА! Деление на 0.");
        }
    }
}
