package homework.h02;

// base
// https://leetcode.com/problems/add-binary/
public class T1 {}
class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        return num % 9;
    }
