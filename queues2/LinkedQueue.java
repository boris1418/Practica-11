package com.company;

public class LinkedQueue<T> implements QueueADT<T> {

    public LinkedQueue() {

    }
    @Override
    public void enqueue(T x) {
        LinkedQueueElement<T> element;
        if (size != 0) {
            element = new LinkedQueueElement<>(
                    x,
                    end,
                    null
            );
            element.getPrev().setNext(element);
        } else {
            element = new LinkedQueueElement<>(
                    x,
                    null,
                    null
            );
            start = element;
        }
        end = element;
        ++size;
    }

    @Override
    public T element() {
        if (size != 0) {
            return start.getElement();
        } else {
            return null;
        }
    }

    @Override
    public T dequeue() {
        if (size != 0) {
            T element = start.getElement();
            start = start.next();
            if (start != null) {
                start.setPrev(null);
            }
            --size;
            return element;
        } else {
            return null;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public void clear() {
        this.start = null;
        this.end = null;
        this.size = 0;
        System.gc(); // Garbage collector
    }

    private LinkedQueueElement<T> start;
    private LinkedQueueElement<T> end;
    private int size;

}
