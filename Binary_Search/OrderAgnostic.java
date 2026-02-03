package Binary_Search;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {100, 90, 80, 70, 60, 50, 40, 30, 25, 20, 10, -3, -5};
        int target = 80;
        int ans =orderagnosticbs(arr, target);
        System.out.println(ans);
    }

    static int orderagnosticbs(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        // find whether the array is sorted in asssending or descending
        boolean isAsc = arr[start] < arr[end];
        

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid] ){
                    end = mid -1;
                } else if(target > arr[mid]){
                    start = mid + 1;
                }
            } else{
                if(target > arr[mid]){
                    end = mid - 1;
                } else if(target < arr[mid]){
                    start = mid + 1;
                }
            }
            
        }
        return -1;
    }
}
