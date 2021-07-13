package leetcode.arrayAlgorithm;

/**
 * 做好初始定义，移除元素
 */
public class MoveDuplicates {
    public int removeElement(int[] nums, int val) {
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
}
