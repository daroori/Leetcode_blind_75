package Array;

public class MaxProductSubArray {
    public static int maxProduct(int[] nums) {
       int[] arr = new int[3];
       int max = nums[0],min = nums[0],ans=nums[0];
       for(int i=1;i< nums.length;i++){

           arr[0] = nums[i];
           arr[1] = max * nums[i];
           arr[2] = min * nums[i];

           max = Math.max(Math.max(arr[0],arr[1]), arr[2]);
           min = Math.min(Math.min(arr[0],arr[1]), arr[2]);

           ans = Math.max(max,ans);
       }
       return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }

}
