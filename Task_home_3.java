import javax.sound.sampled.SourceDataLine;

//Реализовать простой калькулятор

import java.util.Scanner;

public class Task_home_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input operation: ");
        String operate = iScanner.nextLine();
        double rez = 0;
        System.out.printf("Input first number: ");
        double f_num = iScanner.nextFloat();
        System.out.printf("Input two number: ");
        double t_num = iScanner.nextFloat();

        switch (operate) {
            case "+": {
                rez = f_num + t_num;
                break;
            }
            case "*": {
                rez = f_num * t_num;
                break;
            }
            case "-": {
                rez = f_num - t_num;
                break;
            }
            case "/": {
                rez = f_num / t_num;
                break;
            }

        
        }
        System.out.println(rez);



    }
}
