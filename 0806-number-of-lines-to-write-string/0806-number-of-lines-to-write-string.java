class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int l = 1;
        int c = 0;

        for(int i = 0 ; i < s.length() ; i++){
            int w = widths[s.charAt(i) - 'a'];

            if(c + w > 100){
                l++;
                c = w;
            }else{
                c += w;
            }
        }

        return new int[]{l,c};
    }
}