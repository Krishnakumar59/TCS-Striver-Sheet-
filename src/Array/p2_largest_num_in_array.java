package Array;

public class p2_largest_num_in_array {
    public static void main(String[] args) {
        int[] array = {2,5,1,3,0};
        int max = array[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }
        System.out.println("Largest Number : "+max);
    }
}
