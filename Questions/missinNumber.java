class Solution {
    public int missingNumber(int[] nums){
        int n = nums.length;
        int expected_Sum = n *(n+1)/2;

        int actual_Sum = 0;
        for(int num: nums){
            actual_Sum += num;
        }

        return expected_Sum - actual_Sum;

    }
}