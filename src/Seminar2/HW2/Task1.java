/*
ЗАДАЧА 1
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должен приводить к падению приложения,
вместо этого необходимо повторно запросить у пользователя ввод данных.
*/


package Seminar2.HW2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float result = inputFloat();
        System.out.printf("Ваше значение %f", result);
    }

    public static float inputFloat() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дробное число через запятую (например, 1,2): ");
        while (!in.hasNextFloat()) {
            in.next();
            System.out.print("Неверный ввод! Попробуйте снова! Введите дробное число через запятую (например, 1,2): ");
        }
        return in.nextFloat();
    }
}
