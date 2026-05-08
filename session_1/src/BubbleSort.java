import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8,10,1,5,6,2};

        System.out.println("Unsorted Array : " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    swap(arr, i, j); //swap array elem if i elem large than j 10>1
                }
            }
        }

        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
