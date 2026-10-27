import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> mappings = new HashMap<>();
        mappings.put(')', '(');
        mappings.put(']', '[');
        mappings.put('}', '{');

        Deque<Character> stack = new ArrayDeque<>(); // Preferred over java.util.Stack

        for (char c : s.toCharArray()) {
            if (mappings.containsKey(c)) { // It's a closing bracket
                // If the stack is empty or the top element doesn't match the expected opening bracket
                char topElement = stack.isEmpty() ? '#' : stack.pop(); // Use a dummy char if stack is empty to avoid NullPointerException
                if (topElement != mappings.get(c)) {
                    return false; // Mismatch or empty stack means invalid
                }
            } else { // It's an opening bracket
                stack.push(c);
            }
        }

        return stack.isEmpty(); // All opening brackets must have been matched
    }
}