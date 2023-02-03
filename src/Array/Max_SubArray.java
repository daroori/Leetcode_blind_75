package Array;

public class Max_SubArray {
    public static int maxSubArray(int[] nums) {
        int currSum=0,maxSum =Integer.MIN_VALUE;
        for (int i=0;i< nums.length;i++){

            currSum = currSum + nums[i];

            maxSum = Math.max(maxSum,currSum);

            if(currSum < 0){
                currSum = 0;
            }

        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-1};
        System.out.println(maxSubArray(nums));
    }

}
