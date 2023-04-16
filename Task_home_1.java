// Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)



import java.util.Scanner;

public class Task_home_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input numbers: ");
        int num = iScanner.nextInt();
        int rez = 0;
        for (int i = 1; i <= num; i++) {
            rez += i;
        }
        System.out.println(rez);   
    }
}