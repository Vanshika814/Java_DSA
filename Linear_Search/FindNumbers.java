package Linear_Search;

public class FindNumbers {
    public static void main(String[] args) {
        int[] nums  = {12, 345, 2, 6, 7896};
        System.out.println(findnumbers(nums));
        System.out.println(digits2(-8674487));

    }
    static int findnumbers(int[] nums){
        int count  = 0;
        for(int num: nums){
            if(even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberofDigits = digits(num);
        if(numberofDigits % 2 == 0){
            return true;
        }
        return false;
    }


    // optimised way to find no. of digits
    static int digits2(int num){
        if( num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }


// finding no. of digits
    static int digits(int num){

        if( num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        int count = 0 ;
        while(num > 0){
            count++;
            num = num /10; // num /=10
        }
        return count;

    };
};
