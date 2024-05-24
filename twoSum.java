class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
    return new int[] {};
    }
}
public class twoSum {

    public static void main(String[] args) {
        Solution s=new Solution();
        int nums[]={2,7,15,11};
        int target=9;
        s.twoSum(nums, target);
    }
}