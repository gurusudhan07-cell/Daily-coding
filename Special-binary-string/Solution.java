import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String makeLargestSpecial(String s) {
        if (s.length() <= 2) {
            return s;
        }
        List<String> res = new ArrayList<>();
        int count = 0;
        int anchor = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                String innerOptimized = makeLargestSpecial(s.substring(anchor + 1, i));
                res.add("1" + innerOptimized + "0");
                anchor = i + 1;
            }
        }
        Collections.sort(res, Collections.reverseOrder());
        StringBuilder largestString = new StringBuilder();
        for (String block : res) {
            largestString.append(block);
        }
        return largestString.toString();
    }
}
