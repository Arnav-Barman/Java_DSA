import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int[] arr = {1,4,2,5,3,7,4,8};
       insSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insSort(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                } else break;
            }
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}