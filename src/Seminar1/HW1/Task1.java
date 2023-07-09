// ЗАДАЧА 1
// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения


package Seminar1.HW1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException {
        // Method 1
        int num1 = 10;
        int num2 = 0;
        System.out.println(getDivision(num1, num2));

        // Method 2
        int[] array = new int[]{1, 2, 3, 4, 5};
        getEven(array);

        // Method 3
        String filename = "hello.txt";
        System.out.println(readFile(filename));
    }

    public static int getDivision(int a, int b) {
        return a / b;
    }

    public static void getEven(int[] array) {
        for (int i = 0; i <= array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static String readFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String currentLine = reader.readLine();
        reader.close();
        return currentLine;
    }
}
