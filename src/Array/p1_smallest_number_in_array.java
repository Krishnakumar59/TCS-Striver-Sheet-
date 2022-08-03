package Array;

public class p1_smallest_number_in_array {
    public static void main(String[] args) {

//        1. Find the smallest number in an array
        int[] arr = {2,5,1,3,10};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest Element : "+min);


    }
}
