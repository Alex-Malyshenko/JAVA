/* Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод, который вернет “перевернутый” список.
*/

import java.util.Arrays;
import java.util.LinkedList;

public class Task_home_9 {
    
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> l_in = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println("Исходный список элементов: " + l_in);

        LinkedList<Integer> reversedList = reverseLinkedList(l_in);
        System.out.println("Перевернутый список: " + reversedList);

    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> l_in) {
        LinkedList<Integer> reversedList = new LinkedList<>();

        for (int i = l_in.size() - 1; i >= 0; i--) {
            Integer element = l_in.get(i);
            reversedList.add(element);
        }
        return reversedList;

    }

}

