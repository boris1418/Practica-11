package com.company;

public class LinkedQueueElement<T> {

    public LinkedQueueElement(T element) {
        this.element = element;
    }

    public LinkedQueueElement(
        T element,
        LinkedQueueElement<T> prev,
        LinkedQueueElement<T> next
    ) {
        this.element = element;
        setNext(next);
        setPrev(prev);
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public LinkedQueueElement<T> next() {
        return next;
    }

    public void setNext(LinkedQueueElement<T> next) {
        this.next = next;
    }

    public LinkedQueueElement<T> getPrev() {
        return prev;
    }

    public void setPrev(LinkedQueueElement<T> prev) {
        this.prev = prev;
    }

    private LinkedQueueElement<T> next;
    private LinkedQueueElement<T> prev;
    private T element;

}
