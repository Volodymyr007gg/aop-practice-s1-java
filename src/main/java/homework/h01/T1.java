package homework.h01;

// base
// https://leetcode.com/problems/palindrome-number/
public class T1 {}
class Solution {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        }
        return n * 2;
    }
}
