package com.britetech.practice2;

public class Queue {
    int[] queue =null;
    int front =0;
    int rear = 0;
    int currentSize=0;

    public Queue(int queueSize){
        this.queue = new int[queueSize];
        this.rear = -1;
    }

    public void enqueue(int data){
        if (isQueueEmpty()){
            queue[++rear] = data;
            this.currentSize++;
        }else{
            System.out.println("Queue is Full");
        }
    }


    public void dequeue(){
        if (this.currentSize==0){
            System.out.println("Queue Under flow");
            return;
        }
        if (this.currentSize>0 || queue.length>=this.currentSize){
            int removeEntry = queue[front++];
            this.currentSize--;
            System.out.println("Removed Element "+ removeEntry);
        }
    }

    public boolean isQueueEmpty(){
      boolean isEmpty = queue.length > this.currentSize ? true : false;
        return isEmpty;
    }

    public boolean isQueueFull(){
        boolean isFull = queue.length==this.currentSize ? true : false;
        return isFull;
    }
    public int queueSize(){
        return this.currentSize;
    }

    public static void main(String[] args){
        Queue queue = new Queue(10);
        queue.enqueue(50);
        queue.enqueue(51);
        queue.enqueue(52);
        queue.enqueue(53);
        queue.enqueue(54);
        queue.enqueue(55);
        queue.enqueue(56);
        queue.enqueue(57);
        queue.enqueue(58);
        queue.enqueue(59);
        queue.enqueue(60);
        System.out.println("Current queue size is .."+queue.queueSize());  ;
        queue.dequeue();
        System.out.println("Current queue size is .."+queue.queueSize());  ;

    }
}
