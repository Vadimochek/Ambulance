import java.util.Scanner;

public class Help {
    public static void main(String[] args) {

    }

    public int getTemperature(double Temp){
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
    public boolean orvi(String say){
        return say.equals("Да")||say.equals("да");
    }
    public int rvirus(String say, String say2){
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
    public int diabet(String s1, String s2){
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
    public boolean simptoms(String say){
        return say.equals("Да")||say.equals("да");
    }
    public String diagnose(int temp, boolean orvibool, int diabetik, int rotavirus,boolean simpts){
        if (temp==1 && orvibool && simpts && rotavirus!=1) return "У Вас, скорее всего, ОРВИ. Обратитесь к врачу.";
        else if ((temp==1 || orvibool) && rotavirus>=0 ) return "У Вас, скорее всего, ротавирус. Обратитесь к врачу.";
        else if (diabetik>=0 && simpts) return "У Вас может быть диабет! Сдайте кровь на анализ.";
        else if (orvibool && temp==0 && !simpts) return "У Вас лёгкая форма ОРВИ";
        else if (temp==0 && !orvibool && !simpts && diabetik==-1 && rotavirus==-1) return "Вы здоровы";
        else return "У Вас лёгкое недомогание";
    }
}
