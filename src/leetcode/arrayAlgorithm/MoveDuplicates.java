package leetcode.arrayAlgorithm;

/**
 * 做好初始定义，移除元素
 */
public class MoveDuplicates {
    public int removeElementV1(int[] nums, int val) {
        //参数校验
        if(nums.length==0||nums==null) return 0;
        int i=0,j=nums.length-1;
        int elementNums=0;
        while(i<j){
            if(nums[i]!=val) i++;
            else{
                elementNums++;
                while(i<j){
                   if(nums[j]==val){
                       elementNums++;
                       nums[j]=0;
                       j--;
                   }
                   else{
                       nums[i]=nums[j];
                       nums[j]=0;
                       i++;
                       j--;
                       break;
                   }
                }
            }
        }
        if(nums[i]==val) {
            elementNums++;
            nums[i]=0;
        }
        return elementNums++;
    }

    /**
     * 此防范参考移除零元素的方法实现
     */
    public int removeElementV2(int nums[],int val){
        if(nums.length==0) return 0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                result++;
            }
            else{
                nums[i-result]=nums[i];
            }
        }
        return nums.length-result;
    }
}
