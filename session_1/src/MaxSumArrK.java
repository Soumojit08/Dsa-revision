public class MaxSumArrK {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 2, 9, 9, 9};
        int k = 3; //win size

        int size = arr.length;

        int i = 0;
        int j = 0;

        int max = Integer.MIN_VALUE;
        int sum = 0;

        while (j < size) {
            sum += arr[j];

            int winSize = j - i + 1;

            if (winSize < k) {
                j++;
            } else if (winSize == k) {
                max = Math.max(max, sum);
                sum -= arr[i];

                j++;
                i++;
            }
        }

        System.out.println("Max Sum : " + max);
    }
}
