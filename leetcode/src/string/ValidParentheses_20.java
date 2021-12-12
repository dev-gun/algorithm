package string;

import java.util.Stack;

public class ValidParentheses_20 {
    public static void main(String[] args) {
        Solution20 solution = new Solution20();
        System.out.println(solution.isValid("{}[]()"));
    }
}
class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                char openTag = stack.pop();
                if(c == ')') {
                    if(openTag != '(') {
                        return false;
                    }
                } else if(c == ']') {
                    if(openTag != '[') {
                        return false;
                    }
                } else if(c == '}') {
                    if(openTag != '{') {
                        return false;
                    }
                }
            }
        }
        return stack.size() == 0;
    }
}