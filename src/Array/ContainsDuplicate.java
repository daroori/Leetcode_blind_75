package Array;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        boolean contains = false;
        for(int i=0;i< nums.length;i++){
            for(int j = i+1; j < nums.length;j++){
                if (nums[i]==nums[j]){
                    contains = true;
                }
            }
        }
        return contains;
    }

    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        System.out.println(containsDuplicate(nums));
//        int[] nums ={1,2,3,1};
//        System.out.println(containsDuplicate(nums));
    }
}
