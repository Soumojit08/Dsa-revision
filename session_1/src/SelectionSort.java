import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {8, 10, 1, 5, 6, 2};

        System.out.println("Unsorted Array : " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            // Assume the first element of the unsorted part is the minimum
            int min = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[min]>arr[j]){
                    min = j;
                }
            }
            swap(arr, i, min);
        }

        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
