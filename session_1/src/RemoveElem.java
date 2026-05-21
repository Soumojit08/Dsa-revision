import java.util.Arrays;

public class RemoveElem {
    public static void main(String[] args) {
        int[] arr = {3,2,0,0,3,5};
        int k = 0;

        remove(arr, k);
    }

    public static void remove(int[] arr, int k){
        int n = arr.length;
        int j = 0;
        for (int i=0;i<n;i++){
            if (arr[i] != k){
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(j);
    }
}
