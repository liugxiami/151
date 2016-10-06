package com.ccsi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());    // --> Returns -3.
        minStack.pop();
        System.out.println(minStack.top());      //--> Returns 0.
        System.out.println(minStack.getMin());   //--> Returns -2.
    }
}
//Design a stack that support push,pop,top,and retrieveing th minimum element in constant time.
//push(x) ---push element x onto stack
//pop()---Removes the element on top of the stack
//top()---Get the top element
//getMin()--Retrieve the minimun element in the stack

class MinStack{
    private Stack<Integer> data;
    private Stack<Integer> minimums;

    public MinStack() {
        this.data = new Stack<>();
        this.minimums = new Stack<>();
    }

    public void push(int x){
        this.data.push(x);
        if(this.minimums.isEmpty()||this.minimums.peek()>=x){
            this.minimums.push(x);
        }
    }
    public void pop(){
        if(this.data.pop()==this.minimums.peek()){
            this.minimums.pop();
        }
    }

    public int top(){
        return this.data.peek();
    }
    public int getMin(){
        return this.minimums.peek();
    }
}