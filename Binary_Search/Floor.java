package Binary_Search;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {-2, -3, -4, 5, 6, 7, 19, 33, 44 ,54, 66, 99, 287};
        int target = 34;
        int ans = floor(arr, target);
        System.out.println(ans);
        
    }
     static int floor(int[] arr, int target){
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
        return arr[end];
     
    }
}
