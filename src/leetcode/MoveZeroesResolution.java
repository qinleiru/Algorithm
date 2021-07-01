package leetcode;

public class MoveZeroesResolution {
    /**
     * 此方法改变了数组的相对的位置
     * @param nums
     */
    public void moveZeroesToEnd(int[] nums) {
        if(nums.length==1) return;
        int i=0,j=nums.length-1;
        while(i<j&&i<nums.length&&j>=0){
            if(nums[i]!=0){
                i++;
            }
            else{
                if(nums[j]!=0){
                    nums[i]=nums[j];
                    nums[j]=0;
                    i++;
                    j--;
                }
                else
                    j--;
            }
        }

    }

    /**
     * 此方法的实现不改变数组的相对位置
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        if(nums.length==1) return;
        int zeroNums=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zeroNums++;
            else
                nums[i-zeroNums]=nums[i];
                nums[i]=0;
        }

    }
}
