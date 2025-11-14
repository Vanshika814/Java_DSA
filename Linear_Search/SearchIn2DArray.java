package Linear_Search;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {18, 37, 6},
            {37, 91, 9, 35},
            {23, 28, 95, 1, 3},
            {7, 8}
        };
        int target = 35;
        int[] ans = search(arr, target); //format of return value (row, col)
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] search(int[][] arr, int target ){
        for (int row=0; row<arr.length; row++){
            for (int col =0; col<arr[row].length; col++){
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row=0; row<arr.length; row++){
            for (int col =0; col<arr[row].length; col++){
                if (arr[row][col]> max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
