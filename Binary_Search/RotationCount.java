package Binary_Search;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3};
        System.out.println(countRotations(arr));
    }
    static int countRotations(int[] arr){
        int pivot = findPivot(arr);
        // if(pivot == -1){
        //     //arr is not roatated 
        //     return 0;
        // }
        return pivot + 1;
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start <= end ){
            int mid = start + (end-start)/2;
            if(mid< end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int findPivotDuplicates(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start <= end ){
            int mid = start + (end-start)/2;
            if(mid< end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            //if elements at start mid end are equal then skip the duplicates
            if(arr[mid] ==  arr[start] && arr[mid] == arr[end]){
                //skip the duplicates
                //note: what if these elements at start and end where the pivot??
                //check if start is pivot
                if(arr[start] < arr[end -1]){
                    return start;
                }
                start++;
                //check whether end is pivot or not 
                if(arr[end] < arr[end -1]){
                    return end - 1;
                }
                end--;
            }
            //left side is sorted, so pivot shud be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            
        }
        return -1;
    }
}
