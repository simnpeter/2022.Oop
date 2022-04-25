package oop.labor09.lab9;

public interface IQueue {

    void enQueue(Object obj);
    Object deQueue();
    void printQueue();
    boolean isFull();
    boolean isEmpty();

}
