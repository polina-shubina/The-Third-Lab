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
                        System.out.println(a + " лет");
                        break;
                    case ("1"):
                        System.out.println(a + " год");
                        break;
                    case ("2"):
                        System.out.println(a + " годa");
                        break;
                    case ("3"):
                        System.out.println(a + " годa");
                        break;
                    case ("4"):
                        System.out.println(a + " годa");
                        break;
                    case ("5"):
                        System.out.println(a + " лет");
                        break;
                    case ("6"):
                        System.out.println(a + " лет");
                        break;
                    case ("7"):
                        System.out.println(a + " лет");
                        break;
                    case ("8"):
                        System.out.println(a + " лет");
                        break;
                    case ("9"):
                        System.out.println(a + " лет");
                        break;
                    default:
                        System.out.println("Возникла ошибка с определением");
                }
            }
        }
    }

    public static void age(String year){
        try{
            int i = Integer.parseInt(year.trim());
            form(2024-i);
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
