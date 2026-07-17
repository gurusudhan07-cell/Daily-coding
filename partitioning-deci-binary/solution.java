class Solution {
    public int minPartitions(String n) {
        int maxDigit = 0;
        
        // Since deci-binary numbers only contain 0s and 1s, the minimum 
        // number of terms required is determined by the largest digit in the string.
        for (int i = 0; i < n.length(); i++) {
            int currentDigit = n.charAt(i) - '0';
            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;
            }
        }
        
        return maxDigit;
    }
}
