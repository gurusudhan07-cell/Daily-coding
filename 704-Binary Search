#Binary Search Problems

## 1. [704. Binary Search](https://leetcode.com/problems/binary-search/)

### Problem
Given a sorted array of integers `nums` and an integer `target`, return the index of `target` if it exists in `nums`. Otherwise, return `-1`.

### Approach
Standard binary search. Repeatedly divide the search range in half by comparing the middle element with the target:
- If `nums[mid] == target`, return `mid`.
- If `nums[mid] < target`, search the right half.
- If `nums[mid] > target`, search the left half.

### Code (Java)
```java
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}


```
### Complexity
- Time: O(log n)
- Space: O(1)
---
