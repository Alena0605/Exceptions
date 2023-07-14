/*
ИТОГОВОЕ ЗАДАНИЕ
*/


package Seminar3.HW3;

public class Main {
    public static void main(String[] args) throws Exception {
        while (true) {
            UserData ud = new UserData();
            String[] dataArray = ud.getUserData();
            User user = ud.checkUserData(dataArray);

            if (user != null) {
                ud.saveData(user);
                System.out.println("===================================================================");
                System.out.println("Данные успешно записаны!");
                System.out.println("===================================================================");
                return;
            }
        }
    }
}
