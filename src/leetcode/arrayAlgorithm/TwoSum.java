package leetcode.arrayAlgorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 地址：https://leetcode-cn.com/problems/two-sum/
 */
public class TwoSum {
    /**
     * 暴力枚举
     */
    public int [] solution1(int[] nums,int target){
        int length=nums.length;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(nums[j]==target-nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        // attention  数组可以指定长度为0
        return new int[0];
    }

    /**
     * 哈希表  attention 重点掌握的方法
     */
    public int [] solution2(int[] nums,int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{i, hashtable.get(target - nums[i])};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}
