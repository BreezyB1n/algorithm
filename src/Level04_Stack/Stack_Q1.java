package Level04_Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Stack_Q1 {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        if (s.length() <= 1) {
            return false;
        }
        Map<Character, Character> smap = new HashMap<>();
        smap.put('(',')');
        smap.put('{','}');
        smap.put('[',']');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            if (smap.containsKey(item)) {
                stack.push(item);
            } else {
                if (!stack.isEmpty()) {
                    Character left = stack.pop();
                    char right = smap.get(left);
                    if (right != item) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
