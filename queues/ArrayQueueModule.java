package com.company;

public class ArrayQueueModule {

    ArrayQueue<Integer> queue;

    ArrayQueueModule() {
        queue = new ArrayQueue<>();
    }

    public void run() {
        queue.enqueue(5);
        queue.enqueue(55);
        queue.enqueue(1000);
        System.out.println(queue.element());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        /* Stress test to check O(1) */
        for (int i = 0; i < 5000000; ++i) {

            queue.enqueue(i);

        }

        System.out.println(queue.size());

        for (int i = 0; i < 5000000; ++i) {

            queue.dequeue();
        }

        System.out.println(queue.size());

        /* fill before clear */
        for (int i = 0; i < 5000000; ++i) {

            queue.enqueue(i);

        }

        System.out.println(queue.size());

        queue.clear();

        System.out.println(queue.size());

        /* Stress test if instance after clear works good */
        for (int i = 0; i < 5000000; ++i) {

            queue.enqueue(i);

        }

        System.out.println(queue.size());

        for (int i = 0; i < 5000000; ++i) {

            queue.dequeue();
        }

        System.out.println(queue.size());

    }
}
