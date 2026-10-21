package homework.h04;

// advanced
// https://leetcode.com/problems/integer-to-roman/
public class T2 {}
class Solution {
    public int findComplement(int num) {
        int mask = (Inger.highest0neBit(num) << 1) - 1;
        return num ^ mask; 
    }
}
