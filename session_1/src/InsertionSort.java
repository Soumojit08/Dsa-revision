import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8,10,1,5,6,2};

        System.out.println("Unsorted : " + Arrays.toString(arr));

        for (int i=1; i<arr.length - 1; i++){
            for (int j = i+1; j > 0 ; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }

        System.out.println("Sorted : " + Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
