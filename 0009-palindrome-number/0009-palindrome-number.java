/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        
    
    // handle negative numbers and numbers ending in 0
    if (x < 0 || (x != 0 && x % 10 == 0)) {
        return false;
    }
    int reversed = 0;
    while (x > reversed) {
        reversed = reversed * 10 + x % 10;
        x /= 10;
    }
    // handle even-length and odd-length palindromes
    return x == reversed || x == reversed / 10;
}

    

}
// @lc code=end

