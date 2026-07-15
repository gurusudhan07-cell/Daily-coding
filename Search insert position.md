## 35. Search Insert Position    (https://leetcode.com/problems/search-insert-position/)

### Problem
Given a sorted array of distinct integers `nums` and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

### Approach
Same binary search logic as above, but when the target isn't found, `left` naturally lands on the correct insertion index once the loop ends (since `left` ends up just past where the target would go).

### Code (Java)
```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]<target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return left;   
    }
}
```

### Complexity
- Time: O(log n)
- Space: O(1)

---
