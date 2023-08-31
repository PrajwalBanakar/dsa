package com.pb;

import java.util.Stack;

public class minStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public minStack()
    {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int val)
    {
        stack.push(val);
        if(minStack.isEmpty())
        {
            minStack.push(val);
        }
        else
        {
            if(val <= minStack.peek())
            {
                minStack.push(val);
            }
            else
            {
                minStack.push(minStack.peek());
            }
        }
    }

    public void pop()
    {
        stack.pop();
        minStack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
