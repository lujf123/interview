package mszn;

import java.util.Stack;

/**
 * 设计一个有 getMin 功能的栈
 */

public class p1_MyStack1 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public p1_MyStack1() {
        stackData = new Stack<Integer>();
        stackMin = new Stack<Integer>();
    }

    public void push(Integer newNum) {
        stackData.push(newNum);
        if (stackMin.isEmpty()) { // 不要忘了空的判断
            stackMin.push(newNum);
        } else if (newNum < stackMin.peek()) {
            stackMin.push(newNum);
        } else {
            stackMin.push(stackMin.peek());
        }
    }

    public Integer pop() {
        if (stackData.isEmpty()) {
            throw new RuntimeException("Your stack is empty.");
        }
        stackMin.pop();
        return stackData.pop();
    }

    public Integer getMin() {
        if (stackMin.isEmpty()) {
            throw new RuntimeException("Your stack is empty.");
        }
        return stackMin.peek();
    }

    public static void main(String[] args) {
        p1_MyStack1 s = new p1_MyStack1();
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(1);
        s.push(2);
        s.push(1);
        System.out.println(s.getMin());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.getMin());
    }
}
