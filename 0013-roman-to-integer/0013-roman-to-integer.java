class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            // Check for subtraction cases
            if (i < s.length() - 1 && getValue(s.charAt(i)) < getValue(s.charAt(i+1))) {
                result -= getValue(s.charAt(i));
            } else {
                result += getValue(s.charAt(i));
            }
        }
        return result;
    }
    
    public static int getValue(char c) {
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }}}