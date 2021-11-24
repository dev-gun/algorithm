package algorithm.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 6, 8, 3, 7, 9, 2, 4, 5};

        int cnt = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                cnt++;
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("비교 횟수 :: "+cnt);
        for(int val: arr){
            System.out.print(val+", ");
        }
    }
}
