public class task2 {
    public static void main(String[] args){
        int [] array = {1,1,0,1,1,1};
        int count=0;
        int maxCount=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==1){
                count++;
            }
            if(array[i]==0 || i==array.length-1){
                if (count>maxCount){
                    maxCount=count;
                }
                count=0;
            }
        }
        System.out.println(maxCount);
    }
}