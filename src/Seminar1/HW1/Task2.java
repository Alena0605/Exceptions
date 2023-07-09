// ЗАДАЧА 2
// Посмотрите на код и подумайте, сколько разных типов исключений вы тут сможете получить?


package Seminar1.HW1;

public class Task2 {
    public static void main(String[] args) {
        String[][] array = new String[][]{{"1", "2", "3"}, {"4", "5", "6"}};
        System.out.println(sum2d(array));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {  // Массив не имеет значений
            for (int j = 0; j < 5; j++) {  // Выход за границы массива
                int val = Integer.parseInt(arr[i][j]);  // Ошибка преобразования строки в число
                sum += val;
            }
        }
        return sum;
    }
}
