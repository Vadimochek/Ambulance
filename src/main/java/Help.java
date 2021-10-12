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
}
