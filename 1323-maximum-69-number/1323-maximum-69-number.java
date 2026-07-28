class Solution {
    public int maximum69Number (int num) {
       int temp = num;
       int s = -1;
       int c = 0;

       while(temp > 0){
            if(temp % 10 == 6){
                s = c;
            }
            temp /= 10;
            c++;
       }

       if(s != -1){
            num += 3 * (int) Math.pow(10,s);
       }

       return num;
    }
}