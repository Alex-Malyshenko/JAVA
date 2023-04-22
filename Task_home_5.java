
/*Реализуйте алгоритм сортировки пузырьком числового массива, 
результат после каждой итерации запишите в лог-файл.
 */

import java.io.*;
import java.util.Arrays;

public class Task_home_5 {

    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("file_log.txt", false)){
            int[] sortArr = {-9, 5, 11, 1, 25, 14, 2, 47, 8, -7, 5, 47, 4};

            for (int i = 0; i < sortArr.length - 1; i++) {
                for(int j = 0; j < sortArr.length - i - 1; j++) {
                    if(sortArr[j + 1] < sortArr[j]) {
                        int swap = sortArr[j];
                        sortArr[j] = sortArr[j + 1];
                        sortArr[j + 1] = swap;
                        writer.write(Arrays.toString(sortArr));
                        writer.append('\n');
                        writer.flush();
                    }
                }
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        } 
    } 
}
