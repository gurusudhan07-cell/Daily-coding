# 3300. Minimum Element After Replacement With Digit Sum

**Difficulty:** Easy  
**Language:** Java  

---

## 📝 Problem Statement

You are given an integer array `nums`.

You replace each element in `nums` with the **sum of its digits**.

Return the **minimum element** in `nums` after all replacements.

---

## 📊 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N \times \log_{10}(M))$, where $N$ is the number of elements in `nums` and $M$ is the maximum value of an element in `nums`.
- **Space Complexity:** $\mathcal{O}(1)$ auxiliary space as the calculations are performed in-place using constant extra variable space.

---

## 💻 Code

```java
class Solution {
    public int minElement(int[] nums) {
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int sum = 0;

            while (num > 0) {
                sum += (num % 10);
                num /= 10;
            }

            ans = Math.min(ans, sum);
        }

        return ans;
    }
}
