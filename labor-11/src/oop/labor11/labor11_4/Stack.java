package oop.labor11.labor11_4;

import java.util.ArrayList;

public class Stack {

    private ArrayList<Object> items = new ArrayList<>();
    private final int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull(){
        return items.size() == capacity;
    }

    public boolean isEmpty(){
        return items.size() == 0;
    }

    public void push(Object object) throws StackException {
        if(!isFull()){
            items.add(object);
        }
        else{
            throw new StackException("STACK IS FULL");
        }
    }

    public void pop()throws StackException {
        if(!isEmpty()){
            items.remove(items.size()-1);
        }
        else{
            throw new StackException("STACK IS EMPTY");
        }
    }

    public Object top()throws StackException {
        if(!isEmpty()){
            return items.get(items.size()-1);
        }
        throw new StackException("STACK IS EMPTY");
    }

    public int getSize(){
        return items.size();
    }
}

