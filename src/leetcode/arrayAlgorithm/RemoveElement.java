package leetcode.arrayAlgorithm;

/**
 * 地址：https://leetcode-cn.com/problems/remove-element/
 */
public class RemoveElement {
    /**
     * 双指针
     * @param nums
     * @param val
     * @return
     */
    public int solution1(int [] nums,int val){
        int n=nums.length;
        if(n==0) return 0;
        int i=0,j=0;
        while (j<n){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
            j++;
        }
        return i;
    }

    /**
     * 双指针优化
     * @param nums
     * @param val
     * @return
     */
    public  int solution2(int [] nums,int val){
        int left = 0, right = nums.size();
        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right - 1];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }
}
