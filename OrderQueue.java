package cw;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class OrderQueue {
    private LinkedList<Order> queue;

    public OrderQueue() {
        this.queue = new LinkedList<>();
    }

    public void enqueue(Order order) {
        queue.addLast(order);
    }

    public Order dequeue() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.removeFirst();
    }

    public Order peek() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.getFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}
