class Solution {
    public int[] findErrorNums(int[] nums) {
      int dup = -1;
      int miss = -1;

      for(int i = 0 ; i < nums.length ; i++){
        int idx = Math.abs(nums[i]) - 1;
        if(nums[idx] < 0){
            dup = Math.abs(nums[i]);
        }else{
            nums[idx] =- nums[idx];
        }
      }   

      for(int i = 0 ; i < nums.length ; i++){
        if(nums[i] > 0){
            miss = i + 1;
            break;
        }
      }

      return new int[] {dup,miss};
    }
}