package com.britetech.practice2;

public class Stack {

    int top = 0;
    int[] stack = null;

    public Stack(int size) {
        stack = new int[size];
        this.top = -1;
    }

    public boolean stackoverflow() {
        if (top == stack.length - 1) {
            System.out.println("\nStack is full");
            return true;
        }

        return false;
    }

    public boolean stackunderflow() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public void pop() {
        if (!stackunderflow()) {
            System.out.print(stack[top]+" ");
            this.top--;
        } else {
            System.out.println("\nstack underflow");
        }

    }

    public void peek() {
        if (this.top != -1) {
            System.out.print(stack[top]+" ");
            return;
        }
        System.out.println("\nNo element found");

    }

    public void push(int number) {
        if (!stackoverflow()) {
            stack[++this.top] = number;
            System.out.print(stack[top] +" ");

        } else {
            System.out.println("stack overflow");
        }

    }

    public static void main(String[] args) {
        int stackSize = 10;
        Stack stack = new Stack(stackSize);
        for (int i = 0; i < stackSize; i++) {
            stack.push(i);
        }
        stack.peek();
        System.out.println("\n****pop out the element***");
        for (int i = 0; i < 10; i++) {
            stack.pop();
        }
        stack.peek();
    }
}
