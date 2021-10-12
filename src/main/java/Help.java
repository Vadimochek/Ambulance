import java.util.Scanner;

public class Help {
    public static void main(String[] args) {
        System.out.println("Здравствуйте! Вас приветствует программа \"Личный врач (альфа)\"!");
        System.out.println("Для того, чтобы узнать диагноз, пройдите короткий опрос. Отвечайте честно.");
        System.out.println("Для начала - какая у Вас температура? Введите число, например, 36,6");
        Scanner in = new Scanner(System.in);
        int temp = getTemperature(in.nextDouble());
        System.out.println("У Вас имеются симптомы ОРВИ (кашель, насморк, головная боль, боль в горле)? Ответьте 'Да' или 'Нет'");
        boolean orv = orvi(in.next());
        System.out.println("У Вас есть повышенное чувство голода и жажды, а также покалывание в кончиках пальцах? Ответьте два раза 'Да' или 'Нет'");
        int diab = diabet(in.next(), in.next());
        System.out.println("У Вас проявляется тошнота, жидкий стул? Ответьте два раза 'Да' или 'Нет'");
        int rot = rvirus(in.next(), in.next());
        System.out.println("Вы замечаете симптомы усталости, сонливости, бессоницы? Ответьте 'Да' или 'Нет'");
        boolean sim = simptoms(in.next());
        System.out.println("Ваши ответы получены. Ожидайте первичный диагноз.");
        System.out.println(diagnose(temp,orv,diab,rot,sim));
    }

    public static int getTemperature(double Temp){
        System.out.println("Ваша температура: "+Temp);
        if (Temp<=36.4){
            System.out.println("Значение ниже нормы");
            return -1;
        }
        else if (Temp>=36.8){
            System.out.println("Значение выше нормы");
            return 1;
        }
        else {
            System.out.println("Нормальное значение");
            return 0;
        }
    }
    public static boolean orvi(String say){
        return say.equals("Да")||say.equals("да");
    }
    public static int rvirus(String say, String say2){
        if (say.equals(say2) && (say.equals("Да") || say.equals("да"))){
            return 1;
        }
        else if (say.equals(say2) && (say.equals("Нет") || say.equals("нет"))){
            return -1;
        }
        else {
            return 0;
        }
    }
    public static int diabet(String s1, String s2){
        if (s2.equals(s1) && (s2.equals("Да") || s2.equals("да"))){
            return 1;
        }
        else if (s2.equals(s1) && (s2.equals("Нет") || s2.equals("нет"))){
            return -1;
        }
        else {
            return 0;
        }
    }
    public static boolean simptoms(String say){
        return say.equals("Да")||say.equals("да");
    }
    public static String diagnose(int temp, boolean orvibool, int diabetik, int rotavirus, boolean simpts){
        if (temp==1 && orvibool && simpts && rotavirus!=1) return "У Вас, скорее всего, ОРВИ. Обратитесь к врачу.";
        else if ((temp==1 || orvibool) && rotavirus>=0 ) return "У Вас, скорее всего, ротавирус. Обратитесь к врачу.";
        else if (diabetik>=0 && simpts) return "У Вас может быть диабет! Сдайте кровь на анализ.";
        else if (orvibool && temp==0 && !simpts) return "У Вас лёгкая форма ОРВИ";
        else if (temp==0 && !orvibool && !simpts && diabetik==-1 && rotavirus==-1) return "Вы здоровы";
        else return "У Вас лёгкое недомогание";
    }
}
