package Methods_and_functions;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,2,34,54,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99; // if you make a change to the obj via refrence variable, the original obj will be changed
    }
}

