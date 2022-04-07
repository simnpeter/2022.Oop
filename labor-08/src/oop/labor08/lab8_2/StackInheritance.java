package oop.labor08.lab8_2;

import java.util.ArrayList;

public class StackInheritance extends ArrayList<Object> {

    private final int capacity;

    public StackInheritance(int capacity){
        this.capacity = capacity;
    }

    public boolean isFull(){
        return this.size() == capacity;
    }

    public boolean isEmpty(){
        return this.size() == 0;
    }

    public void push(Object object){
        if(!isFull()){
            this.add(object);
        }
    }

    public void pop(){
        if(!isEmpty()){
            this.remove(this.size()-1);
        }
    }

    public Object top(){
        if(!isEmpty()){
            return this.get(this.size()-1);
        }
        return null;
    }

    public int getSize(){
        return this.size();
    }
}
