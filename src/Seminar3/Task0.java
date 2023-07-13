/*
ЗАДАНИЕ 0
Перепишите следующий код, используя ресурсный try.
*/


package Seminar3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task0 {
    public static void main(String[] args) {
        System.out.println("ЗАДАЧА 0.");
    }

    public static void rwLine(Path pathRead, Path pathWrite) throws IOException {
        try (BufferedReader in = Files.newBufferedReader(pathRead);
             BufferedWriter out = Files.newBufferedWriter(pathWrite)) {
            out.write(in.readLine());
        }
    }
}
