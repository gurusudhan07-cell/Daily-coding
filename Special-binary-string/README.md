# 761. Special Binary String

An optimal, 0ms execution time recursive solution written in Java for the LeetCode Hard problem.

## 📝 Problem Description
A special binary string is a binary string that meets the following two conditions:
1. The number of `0`s is equal to the number of `1`s.
2. Every prefix of the binary string has at least as many `1`s as `0`s.

You are given a special binary string `s`. A move consists of choosing two consecutive, non-empty, special substrings of `s` and swapping them. Two substrings are consecutive if the last character of the first substring is exactly one index before the first character of the second substring.

Return the **lexicographically largest** resulting string possible after applying any number of moves.

### Examples
- **Input:** `s = "11011000"` -> **Output:** `"11100100"`
- **Input:** `s = "10"` -> **Output:** `"10"`

---

## 💡 Intuition & Approach (Valid Parentheses Analogy)
The definitions given for a "special binary string" mirror the exact mathematical traits of a **Valid Parenthesis Expression** if we map `1` to `(` and `0` to `)`.
- Rule 1 ensures every open bracket has a closing match.
- Rule 2 ensures brackets never prematurely close out of order (e.g., you can't have `)(`).

### Splitting and Sorting
To make a string lexicographically as large as possible, we want strings heavily weighted with `1`s at the beginning. In parenthesis terms, deeply nested structures like `((...))` must be prioritized to sit *before* simpler, shallow structures like `()`.

1. **Tokenize:** We traverse the string and track a balance `count` (incrementing for `1`, decrementing for `0`). Every time the count resets to `0`, we have isolated a standalone, fully valid "special" block.
2. **Recurse:** For each independent block, the outermost `1` and trailing `0` are structurally locked. However, the inner substring is *also* a valid special binary string. We recursively optimize the inner contents.
3. **Sort & Combine:** We collect all processed blocks, sort them in descending order (lexicographically largest first), and join them together.

### Complexity Analysis
- **Time Complexity:** $O(N^2)$ in the worst-case due to substring slicing and sorting at each recursion level, though highly optimized in practice due to small constraint limits ($N \le 50$).
- **Space Complexity:** $O(N)$ to hold the split tokens and recursive frames.
