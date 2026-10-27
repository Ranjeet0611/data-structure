# Valid Parentheses

**Platform:** [AlgoMaster](https://algomaster.io/practice/dsa/valid-parentheses) · **Difficulty:** Easy · **Language:** java

## Valid Parentheses

## Problem
Check if a string of parentheses `(`, `)`, `{`, `}`, `[`, `]` is valid. Valid means open brackets close with the same type and in the correct order.

## Approach
This solution uses a stack.
1.  Iterate through each character in the string.
2.  If an opening bracket (`(`, `[`, `{`) is found, push it onto the stack.
3.  If a closing bracket (`)`, `]`, `}`) is found:
    *   Check if the stack is empty or if its top element is not the corresponding opening bracket. If so, the string is invalid.
    *   Otherwise, pop the matching opening bracket from the stack.
4.  After checking all characters, the string is valid if and only if the stack is empty.

## Complexity
*   **Time:** O(N), where N is the length of the input string. We iterate through the string once, and stack operations are O(1) on average.
*   **Space:** O(N) in the worst case (e.g., "((((("). O(1) in the best case (e.g., "()()()").

## Review
The current solution correctly solves the problem using a standard stack approach. It handles all constraints. However, there are areas to improve readability, maintainability, and use modern Java practices.

## Improvements
The core stack algorithm is optimal in terms of time and space complexity. Improvements focus on code quality:
1.  **Use `ArrayDeque`:** Replace `java.util.Stack` with `java.util.Deque` (e.g., `new ArrayDeque<>()`) for better performance and API.
2.  **Map Bracket Pairs:** Use a `HashMap<Character, Character>` to store closing-to-opening bracket mappings. This makes the matching logic cleaner.
3.  **Early Exit:** Immediately return `false` if a closing bracket is encountered and the stack is empty or its top element doesn't match. This can improve performance for invalid inputs.
4.  **Clearer Logic:** Explicitly handle opening brackets (push) and closing brackets (check and pop) separately.

## Takeaways
*   **Stack for Order and Nesting:** Stacks are ideal for problems involving ordered sequences, nesting, and matching pairs.
*   **LIFO Principle:** The Last-In, First-Out (LIFO) nature of stacks naturally handles the requirement that the most recently opened bracket must be the first one closed.
*   **Early Exit Optimization:** For validation problems, returning early when an invalid state is detected can improve performance.
*   **Mapping for Readability:** Using `HashMap` for relationships (like bracket pairs) makes code more readable and extensible.
*   **Modern Java Practices:** Prefer `ArrayDeque` over `java.util.Stack` for stack implementations in Java.

## Where it applies
This problem is a classic application of the **Stack** data structure and the **LIFO (Last-In, First-Out)** principle.
Reach for stacks when you need to:
*   Manage nested structures.
*   Enforce correct ordering of operations or elements.
*   Match opening and closing pairs.

Similar well-known problems:
*   **Balanced Brackets:** A direct generalization for any set of matching delimiters.
*   **Reverse Polish Notation (RPN) Evaluation:** Evaluating arithmetic expressions in postfix notation.
*   **Basic Calculator problems:** Parsing and evaluating more complex arithmetic expressions.
*   **Next Greater Element:** Finding the next greater element for each element in an array, often using a monotonic stack.
