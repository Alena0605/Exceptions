/*
ЗАДАЧА 4
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
*/


package Seminar2.HW2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws Exception {
        String result = checkInput();
        System.out.println(result);
    }

    public static String checkInput() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое сообщение: ");
        String result = in.nextLine();
        if (result.isEmpty()) {
            throw new Exception("ОШИБКА! Пустой ввод!");
        }
        return result;
    }
}
