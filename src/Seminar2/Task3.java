/*
ЗАДАЧА 3
Запишите в файл следующие строки:
Анна=4
Елена=5
Марина=6
Владимир=?
Константин=?
Иван=4

Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap).
В отдельном методе нужно будет пройти по структуре данных.
Если сохранено значение ?, заменить его на соответствующее число.
Если на каком-то месте встречается символ, отличный от числа или ?, бросить подходящее исключение.
Записать в тот же файл данные с замененными символами ?.
*/


package Seminar2;

import java.io.*;
import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        String filename = "Seminar2_Task3.txt";

        try {
            HashMap<String, String> lines = readFile(filename);
            HashMap<String, String> correctData = checkData(lines);
            changeFile(filename, correctData);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Работа с данными завершена!");
        }
    }

    public static HashMap<String, String> readFile(String filename) {
        HashMap<String, String> names = new HashMap<>();

        try {
            File file = new File(filename);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            if (line != null) {
                String[] row = line.split("=");
                names.put(row[0], row[1]);
            }

            while (line != null) {
                line = reader.readLine();
                if (line != null) {
                    String[] row = line.split("=");
                    names.put(row[0], row[1]);
                }
            }
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return names;
    }

    public static void changeFile(String filename, HashMap<String, String> data) {
        try (FileWriter writer = new FileWriter(filename, false)) {
            for (String key : data.keySet()) {
                writer.write(key + "=" + data.get(key));
                writer.append("\n");
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static HashMap<String, String> checkData(HashMap<String, String> data) {
        for (String key : data.keySet()) {
            if (data.get(key).equals("?")) {
                String nameLen = Integer.toString(key.length());
                data.put(key, nameLen);
            } else if (!data.get(key).equals("?") && !isNumeric(data.get(key))) {
                throw new RuntimeException("Ошибка! Указан неизвестный символ!");
            }
        }
        return data;
    }

    public static boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
