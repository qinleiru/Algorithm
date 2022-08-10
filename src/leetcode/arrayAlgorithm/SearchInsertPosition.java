package leetcode.arrayAlgorithm;

/**
 * 地址：https://leetcode-cn.com/problems/search-insert-position/
 */
public class SearchInsertPosition {
    /**
     * 二分法
     * @param nums
     * @param target
     * @return
     */
    public int solution1(int[] nums, int target){
        int length=nums.length;
        int left=0,right=length-1,ans=length;
        while(left<=right){
            // attention 寻找中间元素使用右移
            int middle=left+((right-left)>>1);
            if(target<=nums[middle]){
                right=middle-1;
                ans=middle;
            }else {
                left=middle+1;
            }
        }
        return ans;
    }
}
