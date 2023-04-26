// Реализовать алгоритм сортировки слиянием.

public class Task_home_6 {
    
    public class sortArray<T> {}

    public static void quickSort(int[] sortArr, int low, int high) {
        if (sortArr.length == 0 || low >= high) return;

        int middle = low + (high - low) / 2;
        int border = sortArr[middle];

        int i = low, j = high;
        while (i <= j) {
            while (sortArr[i] < border) i++;
            while (sortArr[j] > border) j--;
            if (i <= j) {
                int swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
            }
        }
    
        if (low < j) quickSort(sortArr, low, j);
        if (high > i) quickSort(sortArr, i, high);
    }
    
    public static void main(String args[]) {
        int[] sortArr = {-9, 4, 8,14, 54, 44, -8, 0, 1, 11, 78, 3, -11};
        quickSort(sortArr, 0, sortArr.length - 1);
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + " ");
        }
    }
}