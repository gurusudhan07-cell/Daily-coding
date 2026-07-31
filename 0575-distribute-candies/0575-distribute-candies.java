class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int u = 1;
        for(int i = 1 ; i < candyType.length ; i++){
            if(candyType[i] != candyType[i - 1]){
                u++;
            }
        }   
    return Math.min(u,candyType.length/2);
    }
}