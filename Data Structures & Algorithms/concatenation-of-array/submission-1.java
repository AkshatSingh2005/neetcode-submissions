class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] numbers = new int[2*nums.length];

        for (int i=0 ; i<nums.length ; i++){
            numbers[i] = nums[i];
            numbers[i+nums.length] = nums[i];
        }

        return numbers;
    }
}