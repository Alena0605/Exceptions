/*
ЗАДАЧА №6
Дан класс:
https://github.com/sabinaIsm/test/blob/d2ebf811b85139783b1a0dcbe3714dbb28deee82/RandomExceptionsClass.java
Запустите код. С помощью анализа стектрейса найдите и, по возможности, исправьте ошибки,
добейтесь корректного выполнения программы.
*/


package Seminar1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Task6 {
    public static void main(String[] args) throws IOException {
        callMethod6("");
//        ArrayList<String> stringArraysList = (ArrayList<String>) callMethod1();
        int a = 10, b = 1;  // значение b изменили на 1
        callMethod6("");
        int div = callMethod2(a, b);
        System.out.println(div);
        callMethod6("");
//        callMethod3(stringArraysList);
    }

    private static void callMethod6(String s) {
        System.out.println("Hello World, it's me!");
    }

    private static void callMethod3(ArrayList<String> stringArraysList) {
        callMethod6("");
        callMethod3(stringArraysList);
    }

    private static Collection<String> callMethod1() throws IOException {
        callMethod2(100000000, 10 - 9);  // Изменили вторую 10 на 9
        return new LinkedList<>();
    }

    public static int callMethod2(int a, int b) throws IOException {
        callMethod6("");
        // Создать файл 1.txt, что-то записать в него и в следующей строке в скобках указать полный путь
        FileInputStream fis = new FileInputStream("АБСОЛЮТНЫЙ ПУТЬ ДО ФАЙЛА");
        fis.read();

        if (fis.available() <= 0) throw new RuntimeException();
        int num = callMethod4("1240");
        return a / b;
    }

    private static int callMethod4(String s) {
        callMethod5(s);
        return Integer.parseInt(s);
    }

    private static void callMethod5(String s) {
        callMethod6("");
        String[] strings = new String[5];
        for (int i = 0; i < strings.length; i++) {  // Изменить начальное значение i на 0 и диапазон строго меньше
            strings[i] = s;
        }
    }
}
