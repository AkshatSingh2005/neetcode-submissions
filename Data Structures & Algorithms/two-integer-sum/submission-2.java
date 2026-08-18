class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0 ; 
        for(int i=0 ; i<nums.length; i++){
            sum = nums[i];
            
            for (int j=i ; j<nums.length ; j++){
                if (sum < target){
                    sum += nums[j] ;
                }
                
                if(sum == target){
                    return new int[]{i,j}; 
                }
                else{
                    sum = nums[i];
                }
            }
            System.out.println(" ");
        }
        return new int[]{0}; 
    }
}
