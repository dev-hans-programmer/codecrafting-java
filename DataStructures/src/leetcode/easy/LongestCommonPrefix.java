package leetcode.easy;

/**
 * 
 * 14. Longest Common Prefix
 * Solved
 * Easy
 * Topics
 * Companies
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * 
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * 
 * 
 */

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(strs));
    }

    static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int j = 0;

            while (j < prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j))
                j++;

            prefix = prefix.substring(0, j);

            if (prefix == "")
                return prefix;
        }
        return prefix;
    }

}
