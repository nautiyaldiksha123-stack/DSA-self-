class Solution {
    public int removeDuplicates(int[] nums) {
// Diksha_nauti
        int n = nums.length;
        int i = 0;

        while (i < n - 1) {

            if (nums[i] == nums[i + 1]) {
                for (int j = i; j < n - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                n--;
            } 
            else {
                i++;
            }
        }

        return n;
    }
}
