import leetcode.MoveZeroesResolution;

public class MainTest {
    public static void main(String[] args){

        MoveZeroesResolution moveZeroesResolution=new MoveZeroesResolution();
        int nums[]=new int[]{0,1,0,3,12};
        moveZeroesResolution.moveZeroes(nums);
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println();

    }
}
