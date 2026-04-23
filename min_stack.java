/*

Problem #155:
Design a stack supporting push, pop, top, and getMin operations.

Approach:
Use two stacks: one for elements and one for tracking minimums.
Store the current minimum at each push, so getMin is always O(1).

Complexity:
Time: O(1)
Space: O(n)

*/
import java.util.Stack;
class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    public void push(int val){
        stack.push(val);
        
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            minStack.push(Math.min(val, minStack.peek()));
        }
    }
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    public int top() {
        return stack.peek();
    }
    public int getMin() {
        return minStack.peek();
    }
}
