package leetcode.arrayAlgorithm;

/**
 * 地址：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicates {
    /**
     * 双指针的方法
     * @param nums
     * @return
     */
    public int solution(int[] nums){
        int n=nums.length;
        if(n==0)
            return 0;
        int fast=1,slow=1;
        while(fast<n){
            if(nums[fast]!=nums[fast-1]){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
