package Array;

import java.util.Arrays;

public class ProductOfArray {
    public static int[] productExceptSelf(int[] nums) {
        int[] newNums = new int[nums.length];
        int product = 1;
        for(int i=0;i< nums.length;i++){
            for(int j=0;j< nums.length;j++){
                if(i != j){
                    product = product * nums[j];
                }
            }
            newNums[i] = product;
            product = 1;
        }
        return newNums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = productExceptSelf(nums);
//        for (int i=0;i< result.length;i++){
//            System.out.println(result[i] + " ");
//        }
        System.out.println(Arrays.toString(result));
    }
}


