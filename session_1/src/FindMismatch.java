import java.util.Arrays;

public class FindMismatch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};

        Arrays.sort(arr);

        for (int i=0; i<arr.length - 1; i++){
            int ans = arr[i] ^ arr[i+1];

            if (ans == 0){
                System.out.println("Duplicate : " + arr[i]);
                break;
            }
        }

    }
}
