package homework.h08;

// base
// https://leetcode.com/problems/max-consecutive-ones/
public class T1 {}
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, current = 0;
        for (int n : nums) {
            if (n == 1) {
                current++;
                if (current > max) max = current;
            } else {
                current = 0;
            }
        }
        return max;
    }
}
