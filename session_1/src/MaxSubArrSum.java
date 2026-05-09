

public class MaxSubArrSum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        //to store the indx of return subarray
        int start = 0;
        int ansStart = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {

            //current sum 0 so new subarray may start
            if (curSum == 0){
                start = i;
            }

            curSum += arr[i];

            if (maxSum < curSum){
                maxSum = curSum;
                ansStart = start;
                end = i;
            }

            if (curSum < 0){
                curSum = 0;
            }
        }

        System.out.println("Maximum Sum : " + maxSum);

        for (int i = ansStart; i <= end; i++) {
            System.out.print(arr[i] + " , ");
        }
    }
}
