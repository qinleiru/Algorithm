package leetcode.arrayAlgorithm;

/**
 * 地址：https://leetcode-cn.com/problems/plus-one/
 */
public class PlusOne {
    public int[] plusOne(int [] nums){
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            if(nums[i]!=9){
                nums[i]++;
                for(int j=i+1;j<n;j++){
                    nums[j]=0;
                }
                return nums;
            }
        }
        int [] ans=new int[n+1];
        ans[0]=1;
        return ans;
    }
}
