public class MissingNumber {
    public static void main(String[] args) {
        //Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

//        Input: nums = [3,0,1]
//        Output: 2

        int[] arr = {3,0,1};
        int n = arr.length;
        int sumSeries = n * (n+1)/2;
        int sum = 0;

        for (int x : arr){
            sum += x;
        }

        int ans = sumSeries - sum;

        System.out.println("Missing : " + ans);
    }
}
