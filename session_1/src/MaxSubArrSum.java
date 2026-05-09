public class MaxSubArrSum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        for (int i = 0; i < arr.length; i++) {
            curSum+=arr[i];
            maxSum = Math.max(maxSum, curSum);

            if (curSum < 0){
                curSum = 0;
            }
        }

        System.out.println("Maximum Sum : " + maxSum);
    }
}
