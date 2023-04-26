// Реализовать алгоритм сортировки слиянием.

public class Task_home_6 {
    
    public class sortArray<T> {}

    public static void sort(int[] sortArr, int low, int high) {
        if (sortArr.length == 0 || low >= high) return;

        int middle = low + (high - low) / 2;
        int elemMid = sortArr[middle];

        int i = low, j = high;
        while (i <= j) {
            while (sortArr[i] < elemMid) i++;
            while (sortArr[j] > elemMid) j--;
            if (i <= j) {
                int swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
            }
        }
    
        if (low < j) sort(sortArr, low, j);
        if (high > i) sort(sortArr, i, high);
    }
    
    public static void main(String args[]) {
        int[] mass = {-9, 4, 8,14, 54, 44, -8, 0, 1, 11, 78, 3, -11};
        sort(mass, 0, mass.length - 1);
        for(int i = 0; i < mass.length; i++){
            System.out.print(mass[i] + " ");
        }
    }
}