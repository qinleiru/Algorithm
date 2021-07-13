import leetcode.arrayAlgorithm.MoveDuplicates;
import leetcode.arrayAlgorithm.MoveZeroes;

public class MainTest {
    public static void main(String[] args){

        /**
         * MoveZeros
         */
/*        MoveZeroes moveZeroes =new MoveZeroes();
        int nums[]=new int[]{0,1,0,3,12};
        moveZeroes.moveZeroes(nums);
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println();*/

        /**
         * MoveDuplicates
         */
        MoveDuplicates moveDuplicates=new MoveDuplicates();
        int nums[]=new int[]{0,1,2,2,3,0,4,2};
        int value=moveDuplicates.removeElement(nums,2);
        System.out.println(value);
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
