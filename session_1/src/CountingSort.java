import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {8,10,1,5,6,2};

        int max = Integer.MIN_VALUE;

        for (int x : arr) {
            max = Math.max(max, x);
        }

        int[] count = new int[max + 1];

        // frequency
        for (int x : arr) {
            count[x]++;
        }

        // prefix sum
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int[] res = new int[arr.length];

        // stable placement
        for (int i = arr.length - 1; i >= 0; i--) {

            int val = arr[i];
            int pos = count[val] - 1;

            res[pos] = val;

            count[val]--;
        }
        System.out.println(Arrays.toString(res));
    }
}
