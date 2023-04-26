// 3. Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее ариф. из этого списка.

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task_home_8 {
    public static void main(String[] args) throws Exception {
        System.out.print("Введите длину списка: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int N = iScanner.nextInt();
            ArrayList<Integer> ar = new ArrayList<Integer>();
            Random rd = new Random();
            for (int i = 0; i < N; i++) {
                int x = rd.nextInt(N);
                ar.add(x);
            }
            System.out.println("Сгенерированный список целых чисел: " + ar);

            int min = ar.get(0);
            int max = ar.get(0);
            float sum = 0;
            for (int count = 0; count < ar.size(); count++) {
                int num = ar.get(count);
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
                sum += num;
            }
            float mid = sum / ar.size();

            System.out.println("Минимальное значение: " + min);
            System.out.println("Максимальное значение: " + max);
            System.out.println("Среднее арифметическое значение: " + mid);
        }
    }
}