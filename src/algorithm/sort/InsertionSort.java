package algorithm.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 6, 8, 3, 7, 9, 2, 4, 5};

        for(int i = 1 ; i < arr.length ; i++){
            int temp = arr[i];
            int prev = i - 1;
            while( (prev >= 0 ) && (arr[prev] > temp) ) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = temp;
        }
        for(int val: arr){
            System.out.print(val+", ");
        }
    }
}
