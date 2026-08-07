class Solution {
    public int subtractProductAndSum(int n) {
        int t = n;
        int p = 1;
        int s = 0;
        while(t != 0){
            int d = t % 10;
            p *= d;
            s += d;
            t /= 10;
        }
        return p - s;
    }
}