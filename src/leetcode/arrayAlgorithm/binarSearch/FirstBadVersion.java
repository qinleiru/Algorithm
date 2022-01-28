package leetcode.arrayAlgorithm.binarSearch;

/**
 * 地址：https://leetcode-cn.com/problems/first-bad-version/
 */
public class FirstBadVersion {
    /**
     *
     * @param version
     * @return
     */

    public boolean isBadVersion(int version) {
        return false;
    }

    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) { // 循环直至区间左右端点相同
            // attention 为什么要正么计算呢
            int mid = left + (right - left) / 2;// 防止计算时溢出
            if (isBadVersion(mid)) {
                right = mid; // 答案在区间 [left, mid] 中
            } else {
                left = mid + 1; // 答案在区间 [mid+1, right] 中
            }
        }
        // 此时有 left == right，区间缩为一个点，即为答案
        return left;
    }
}
