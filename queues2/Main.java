package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test Array Queue");
        QueueModule arr1 = new ArrayQueueModule(new ArrayQueue<>());
        arr1.run();
        System.out.println("Ok");
        System.out.println("Test Linked Queue");
        QueueModule arr2 = new LinkedQueueModule(new LinkedQueue<>());
        arr2.run();
        System.out.println("Ok");
    }
}
