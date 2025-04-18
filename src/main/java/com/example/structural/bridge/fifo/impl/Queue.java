package com.example.structural.bridge.fifo.impl;


import com.example.structural.bridge.fifo.FifoCollection;
import com.example.structural.bridge.implementor.LinkedList;

public class Queue<T> implements FifoCollection<T> {

    private LinkedList<T> list;

    public Queue(LinkedList<T> list) {
        this.list = list;
    }

    @Override
    public void offer(T element) {
        list.addLast(element);
    }

    @Override
    public T poll() {
        return list.removeFirst();
    }
    
}
