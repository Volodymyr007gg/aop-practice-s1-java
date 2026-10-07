package homework.h05;

// base
// https://leetcode.com/problems/longest-common-prefix/
public class T1 {}
import java.util.Arrays;

class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n - 1] * nums[n - 2] - nums[0] * nums[1];
    }
}
