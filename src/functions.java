import java.time.Year;

public class functions {
    public static void determ(String name){
        if((name.substring(name.length() - 1).equals("а"))){
            System.out.println("Пол: женский");
        }
        else if((name.substring(name.length() - 1).equals("ч"))){
            System.out.println("Пол: мужской");
        }
        else{
            System.out.println("Определить пол не удалось");
        }
    }

    public static void form(int a){
        System.out.print("Возраст: ");
        if(a<0){
            System.out.println("Этот человек из будущего");
        }
        else {
            if (a == 1) {
                System.out.println("1 год");
            } else if (a >= 2 && a <= 4) {
                System.out.println(a + " годa");
            } else if (a >= 5 && a <= 20) {
                System.out.println(a + " лет");
            } else {
                String year = Integer.toString(a);
                switch (year.substring(year.length() - 1)) {
                    case ("0"):
                    case ("5"):
                    case ("6"):
                    case ("7"):
                    case ("8"):
                    case ("9"):
                        System.out.println(a + " лет");
                        break;
                    case ("1"):
                        System.out.println(a + " год");
                        break;
                    case ("2"):
                    case ("3"):
                    case ("4"):
                        System.out.println(a + " годa");
                        break;
                    default:
                        System.out.println("Возникла ошибка с определением");
                }
            }
        }
    }

    public static void age(String year){
        int todayYear = Year.now().getValue();
        try{
            int i = Integer.parseInt(year.trim());
            form(todayYear-i);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Возникла ошибка с определением возраста");
        }
    }

    public static boolean checkF(String fio){
        int count = 0;
        for (int i = 0; i < fio.length();i++){
            if (fio.charAt(i) == ' '){
                count++;
            }
        }
        if(count == 2){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean checkD(String fio){
        int count = 0;
        for (int i = 0; i < fio.length();i++){
            if (fio.charAt(i) == '.'){
                count++;
            }
        }
        if(count == 2){
            return true;
        }
        else{
            return false;
        }
    }
}
