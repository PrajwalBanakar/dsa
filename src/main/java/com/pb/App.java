package com.pb;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        minStack minStack = new minStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
       System.out.println(minStack.top());     // return 0
       System.out.println(minStack.getMin()); // return -2
    }
}
