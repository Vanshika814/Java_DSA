package Linear_Search;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {3, 12, 55, 78, 92, 0, 4};
        System.out.println(min(arr));
    }

    //assume arr.length != 0 
    //return the min value in the array
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i]; // update the answer
            }
        } 
        return ans;
    }
}
