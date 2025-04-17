package com.example.structural.bridge.fifo;

public interface FifoCollection<T> {

    void offer(T element);

    T poll();

}
