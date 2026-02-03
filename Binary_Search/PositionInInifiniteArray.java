package Binary_Search;

public class PositionInInifiniteArray {
    public static void main(String[] args) {
       int[] arr = {3,5,7,9,10,90,100,140,160,170,180,190,210};
       int target = 10;
       System.out.println(findingRange(arr, target));
        
    }
    static int findingRange(int[] arr, int target){
        // first find the range
        //first start with the box of 2
         int start = 0;
         int end = 1;

         //condition for the target to lie in the range
         while(target > arr[end] ){
            int newStart = end + 1;
            //double the box value
            //end = previous end + size of box * 2
            end = end + (end - start + 1) * 2;
            start = newStart;

         }
         return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){

            int mid = start + (end - start) / 2; // find the middle element

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
