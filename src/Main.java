import java.util.Scanner;
/*Пользователь вводит:
+ ФИО по-русски Шубина Полина Дмитриевна
+ дату рождения (число.месяц.год или через слэш, как хотите). 17.04.2006

Программа в ответ выводит
+ инициалы (Лейкин М.В.)
+ пол
+ возраст с правильным окончанием: 32 года, 1 год, 27 лет и т.д.*/

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String fio = scan.nextLine();
        System.out.print("Введите дату рождения в формате хх.хх.хххх: ");
        String dr = scan.nextLine();

        //махинации с фио
        if(functions.checkF(fio)) {
            String[] FIO = fio.split(" ");
            System.out.println("ФИО: " + FIO[0] + " " + FIO[1].charAt(0) + "." + FIO[2].charAt(0) + ".");
            functions.determ(FIO[2]);
        }
        else{
            System.out.println("Неправильно введены ФИО");
        }

        //махинации с др
        if(functions.checkF(fio)) {
            System.out.println("Дата рождения: " + dr);
            String[] DR = dr.split("\\.");
            functions.age(DR[2]);
        }
        else{
            System.out.println("Неправильно введена дата рождения");
        }

    }
}