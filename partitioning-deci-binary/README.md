# Partitioning Into Minimum Number Of Deci-Binary Numbers

An elegant, optimal solution written in Java for the LeetCode problem.

## 📝 Problem Description
Given a string `n` that represents a positive decimal integer, return the **minimum** number of positive deci-binary numbers needed so that they sum up to `n`.

*A deci-binary number is a positive integer where each digit is either `0` or `1` without any leading zeros.*

### Examples
- **Input:** `n = "32"` -> **Output:** `3` (e.g., `11 + 11 + 10 = 32`)
- **Input:** `n = "82734"` -> **Output:** `8`

---

## 💡 Intuition & Approach
Because a deci-binary number can only contribute a maximum value of `1` to any given digit position per term, the total number of terms required is entirely bottlenecked by the **largest single digit** in the string `n`. 

For instance, if a position contains the digit `9`, you are mathematically forced to use at least 9 individual terms to sum up to it, filling the remaining columns with `0`s where necessary. 

### Complexity Analysis
- **Time Complexity:** $O(N)$ where $N$ is the length of the string, as we only need to scan the string once.
- **Space Complexity:** $O(1)$ auxiliary space since we only track the maximum digit found.
