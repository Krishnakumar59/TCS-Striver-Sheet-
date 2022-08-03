package Array;

import java.util.Arrays;
import java.util.OptionalInt;

public class p3_min_max_in_array {
    public static void main(String[] args) {
        int[] array = {1,2,4,7,70,-5};
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length ; i++) {
            if (array[i]>max){
                max = array[i];
            }
            if (array[i]<min)
                min = array[i];
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);



    }
}
