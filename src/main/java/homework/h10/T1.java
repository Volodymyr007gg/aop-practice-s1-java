package homework.h10;

// https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/
public class T1 {

    class Solution {
        public char kthCharacter(int k) {
            StringBuilder sb = new StringBuilder("a");

            while (sb.length() < k) {
                int currentLength = sb.length();
                for (int i = 0; i < currentLength; i++) {
                    char nextChar = (char) (sb.charAt(i) + 1);
                    if (nextChar > 'z') {
                        nextChar = 'a';
                    }
                    sb.append(nextChar);
                }
            }

            return sb.charAt(k - 1);
        }
    }
