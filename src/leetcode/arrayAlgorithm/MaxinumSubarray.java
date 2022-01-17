package leetcode.arrayAlgorithm;

/**
 * https://leetcode-cn.com/problems/maximum-subarray/
 */
public class MaxinumSubarray {
    /**
     * attention 动态规划实现思路
     * @param nums
     * @return
     */
    public int solution1(int[] nums){
        int pre=0,maxAns = nums[0];;
        for (int x:nums){
            pre=Math.max(pre + x,pre);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
    /**
     * attention 分治方法
     */
}
