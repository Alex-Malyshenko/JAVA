// Пусть дан произвольный список целых чисел, удалить из него чётные числа.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Task_home_7 {
    public static void main(String[] args) throws Exception {
        System.out.print("Введите желаемое количество элементов списка : ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int N = iScanner.nextInt();
            ArrayList<Integer> ar = new ArrayList<Integer>();
            Random ran = new Random();
            for (int i = 0; i < N; i++) {
                int x = ran.nextInt(N);
                ar.add(x);
            }
            System.out.println("Сгенерированный список целых чисел: " + ar);

            for (int i = ar.size() - 1; i >= 0; i--) {
                int even = ar.get(i) % 2;
                if (even == 0) ar.remove(i);
            }
            Collections.sort(ar);
            System.out.println("Список с удаленными чётными числами: " + ar);
        }
    }

}