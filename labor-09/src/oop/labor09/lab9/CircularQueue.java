package oop.labor09.lab9;

import java.util.Arrays;

public class CircularQueue implements IQueue {

    private final int CAPACITY;
    private Object[] items;
    private int front;
    private int rear;

    public CircularQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.items = new Object[CAPACITY];
        this.front = -1;
        this.rear = -1;
    }

    @Override
    public void enQueue(Object obj) {
        if(!isFull()){
            rear=(rear+1)%CAPACITY;
            items[rear] = obj;
        }
        if(front == -1){
            front++;
        }
    }

    @Override
    public Object deQueue() {
        Object obj = null;
        if(!isEmpty()){
            obj = items[front];
            items[front] = null;
            if(front == rear){
                front = -1;
                rear = -1;
            }
            else
                front=(front+1)%CAPACITY;
        }
        return obj;
    }

    @Override
    public void printQueue() {
        if(!isEmpty()){
            if(rear > front){
                for (int i = front; i <= rear; i++) {
                    System.out.println(items[i]);
                }
            }
            else{
                for (int i = front; i < CAPACITY; i++) {
                    System.out.println(items[i]);
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.println(items[i]);
                }
            }
        }
    }

    @Override
    public boolean isFull() {
        return (front == 0 && rear == CAPACITY - 1) || (front > rear && rear == front - 1);
    }

    @Override
    public boolean isEmpty() {
        return rear == -1;
    }

    @Override
    public boolean equals(Object o) {
        int n;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CircularQueue that = (CircularQueue) o;
        if (this.front<this.rear){
            n=(this.rear-this.front)+1;
            if(that.front<that.rear){
                if(this.rear-this.front != that.rear- that.front) return false;
            }
            else{
                if(this.rear-this.front != (that.CAPACITY)-that.front+ that.rear) return false;
            }
        }
        else{
            n=((this.CAPACITY)-this.front+ this.rear)+1;
            if(that.front<that.rear){
                if((this.CAPACITY)-this.front+ this.rear != that.rear- that.front) return false;
            }
            else{
                if((this.CAPACITY)-this.front+ this.rear != (that.CAPACITY)-that.front+ that.rear) return false;
            }
        }
        int j=this.front, k= that.front;
        for (int i = 0; i < n; i++) {
            if(this.items[j] != that.items[k]) return false;
            j = (j + 1)% this.CAPACITY;
            k = (k + 1)% that.CAPACITY;
        }
        return true;

    }
}
