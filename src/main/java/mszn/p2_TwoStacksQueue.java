package mszn;

import java.util.Stack;

/**
 * 由两个栈组成的队列
 */

public class p2_TwoStacksQueue {
    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public p2_TwoStacksQueue() {
        stackPush = new Stack<Integer>();
        stackPop = new Stack<Integer>();
    }

    public void add(Integer i) {
        stackPush.push(i);
    }

    public Integer poll() {
        if (stackPop.isEmpty() && stackPush.isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        } else if (stackPop.isEmpty()){
            while (stackPush.isEmpty() != true) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }

    public Integer peek() {
        if (stackPop.isEmpty() && stackPush.isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        } else if (stackPop.isEmpty()) {
            while (stackPush.isEmpty() != true) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }

    public static void main(String[] args) {

    }
}
