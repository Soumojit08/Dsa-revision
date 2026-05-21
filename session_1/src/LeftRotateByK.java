import java.util.Arrays;

public class LeftRotateByK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        leftRotate(arr, k);
    }

    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        //normalize k
        k = k % n;

        //reverse array 3 times
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);

        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
