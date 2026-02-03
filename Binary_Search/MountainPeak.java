package Binary_Search;

public class MountainPeak {
    public static void main(String[] args) {
        
    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end){
            int mid = start + (end - start) / 2;
             if(arr[mid] > arr[mid + 1]){
                //you are in dec part of the arr
                //this can the possible ans but we have to look in left as well
                end = mid;
             } else { 
                //you are in ascending part of arr
                start = mid + 1; // bcz we know that mid element > mid element
             } 
        }
        //in the end, start == end and pointing to the largest number because of the 2 checks above
        //start and end are always trying to find the max elemnt in the above two checks
        //hence, when they are pointing to one element, that is the largest.
        return start;
    }
}
