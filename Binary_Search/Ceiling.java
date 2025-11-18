package Binary_Search;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {-2, -3, -4, 5, 6, 7, 19, 33, 44 ,54, 66, 99, 287};
        int target = 53;
        int ans = ceiling(arr, target);
        System.out.println(ans);
        
    }
    //ceiling: smallest no. greater than equal to >=target
     static int ceiling(int[] arr, int target){
        if(target > arr[arr.length-1]){ // but what if the target is greater than the greatest number in the array
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = start + (end -  start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return arr[start];
     }
}
