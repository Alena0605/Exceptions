/*
ЗАДАЧА 2
Если необходимо, исправьте данный код:
https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit
*/


package Seminar2.HW2;

public class Task2 {
    public static void main(String[] args) {
        int[] intArray = new int[]{11, 12, 13, 14, 15, 16, 17, 18, 19};
        int d = 2;

        try {
            double result = getDivision(intArray, d);
            System.out.println("catchedRes1 = " + result);
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static double getDivision(int[] intArray, int d) {
        if (intArray.length < 9) {
            throw new RuntimeException("ОШИБКА! Выход за границы массива.");
        } else if (d == 0) {
            throw new RuntimeException("ОШИБКА! Деление на 0.");
        } else {
            return (double) intArray[8] / d;
        }
    }
}
