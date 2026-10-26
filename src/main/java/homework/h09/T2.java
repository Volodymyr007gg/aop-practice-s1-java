package homework.h03;

// advanced
// https://leetcode.com/problems/reverse-integer/
public class T2 {}
class Solution {
    public int differenceOfSums(int n, int m) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) result -= i;
            else result += i;
        }
        return result;
    }
}
