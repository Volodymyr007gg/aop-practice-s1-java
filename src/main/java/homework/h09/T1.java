package homework.h09;

// base
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class T1 {}
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = findMax(candies);
        List<Boolean> result = new ArrayList<>();
        for (int c : candies) {
            result.add(c + extraCandies >= max);
        }
        return result;
    }

    private int findMax(int[] arr) {
        int max = arr[0];
        for (int x : arr) {
            if (x > max) max = x;
        }
        return max;
    }
}
