/*
ЗАДАЧА 2
Обработайте возможные исключительные ситуации. “Битые” значения в исходном массиве считайте нулями.
Можно внести в код правки, которые считаете необходимыми.
*/


package Seminar2;

public class Task2 {
    public static void main(String[] args) {
        String[][] array = new String[][]{{"1", "2", "3"}, {"4", "5", "6"}};

        try {
            System.out.println(sum2d(array));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (!isNumeric(arr[i][j])) {
                        arr[i][j] = "0";
                    }
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
            return sum;
        } else {
            throw new RuntimeException("Ошибка! В массиве нет значений!");
        }
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
