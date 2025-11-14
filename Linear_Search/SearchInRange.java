package Linear_Search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {3, 12, 55, 78, 92, 0, -4};
        int target = 92;
        System.out.println(intSearch(arr, target, 1,4));
    }
    static int intSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int index = start; index <= end; index++){
            // check for element at every index if it is == target
            int element = arr[index];
            if( element == target){
                return index;
            }
        }
        return -1;
    }
}
