package com.example.structural.bridge;

import com.example.structural.bridge.fifo.FifoCollection;
import com.example.structural.bridge.fifo.impl.Queue;
import com.example.structural.bridge.implementor.impl.SinglyLinkedList;

public class BridgeExample {
    public static void main(String[] args) {

        FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());

        collection.offer(10);
        collection.offer(5);
        collection.offer(20);

        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());
        
        System.out.println(collection.poll());
    }
}
