class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add((Integer)num); 
        }

        return (set.size() != nums.length);
    }
}