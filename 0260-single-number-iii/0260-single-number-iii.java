class Solution {
    public int[] singleNumber(int[] nums) {
        int a[] = new int[2];
        int idx = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int c = 0;
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    c += 1;
                }
            }
            if(c == 1){
                a[idx++] = nums[i];
                if(idx == 2) break;
            }
        }
        return a;
    }
}