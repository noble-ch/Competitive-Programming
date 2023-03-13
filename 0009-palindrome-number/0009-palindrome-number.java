/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        
    // convert integer to string
    String s = Integer.toString(x);
    // compare string with its reverse
    return s.equals(new StringBuilder(s).reverse().toString());

    }

}
// @lc code=end

