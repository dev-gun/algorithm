package algorithm.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 6, 8, 3, 7, 9, 2, 4, 5};

        int keyword = 7;

        int keywordIndex = getIndex(arr, keyword);
        System.out.printf("%d의 검색 결과 위치는 %d입니다.%n", keyword, keywordIndex);
    }
    public static int getIndex(int[] arr, int keyword){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == keyword){
                return i;
            }
        }
        return -1;
    }
}
