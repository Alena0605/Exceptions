/*
ЗАДАЧА №0
Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
Если длина массива меньше некоторого заданного минимума, метод возвращает -1 в качестве кода ошибки,
иначе - длину массива.
*/


package Seminar1;

public class Task0 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int minLen = 5;
        System.out.println(checkArrayLength(arr, minLen));
    }

    public static int checkArrayLength(int[] array, int minLength) {
        if (array.length < minLength) {
            return -1;
        } else {
            return array.length;
        }
    }
}
