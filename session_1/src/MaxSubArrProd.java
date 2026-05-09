public class MaxSubArrProd {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int currProd = 1;
        int maxProd = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currProd *= arr[i];
            maxProd = Math.max(maxProd, currProd);

            if (currProd < 0){
                currProd = 1;
            }
        }

        System.out.println("Max Prod : " + maxProd);
    }
}
