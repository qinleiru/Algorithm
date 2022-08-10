package leetcode.arrayAlgorithm;

import javax.swing.tree.TreeNode;

/**
 * 地址：https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
 */
class TreeNodes {
    TreeNodes left,right;
    int value;
    TreeNodes(int value){
        this.value=value;
    }
}
public class ConverSortedArrayToBinaryTree {

    public TreeNodes solution1(int[] nums) {
        return helper(nums,0,nums.length-1);
    }

    public TreeNodes helper(int[] nums, int left, int right) {
        if (left>right)
            return null;
        int mid=(left+right)/2;

        TreeNodes root = new TreeNodes(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }
}
