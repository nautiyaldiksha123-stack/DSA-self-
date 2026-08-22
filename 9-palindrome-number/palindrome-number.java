class Solution {
    public boolean isPalindrome(int x) {

        int n = x;
        int ans = 0;

        while (x > 0) {
            int digit = x % 10;

            ans = ans * 10 + digit;

            x = x / 10;
        }

        if (ans == n) {
            return true;
        } else {
            return false;
        }
    }
}