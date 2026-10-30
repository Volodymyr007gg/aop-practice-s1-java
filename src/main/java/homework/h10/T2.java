package homework.h10;

// https://leetcode.com/problems/reverse-string/
public class T2 {

    public void reverseString(char[] chars) {
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}