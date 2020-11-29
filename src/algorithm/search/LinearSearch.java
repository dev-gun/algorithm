package algorithm.search;

public class LinearSearch {
    public static void main(String[] args) {
        //보초법을 위한 맨 뒤 더미 값 추가.
        int[] arr = {1, 6, 8, 3, 7, 9, 2, 4, 5, -1};

        int keyword = 7;

        arr[arr.length-1] = keyword;
        int keywordIndex = getIndex(arr, keyword);
        System.out.printf("%d의 검색 결과 위치는 %d입니다.%n", keyword, keywordIndex);
    }
    public static int getIndex(int[] arr, int keyword){
        int i = 0;
        while (arr[i] != keyword) {
            i++;
        }
        return i == arr.length-1?-1:i;
    }
}
