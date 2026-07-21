class Solution {
    public int findNumbers(int[] nums) {
        int co=0;
        for(int b:nums ){
            int c=0;
            int n=b;
            while (n>0){
                n/=10;
                c=c+1;

            }
            if (c%2==0){
                co++;
            }
        }
        return co;
    }
}