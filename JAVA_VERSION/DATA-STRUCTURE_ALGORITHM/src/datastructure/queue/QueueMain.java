package datastructure.queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.getFirst();
        queue.getLast();
        queue.getLength();
        System.out.println("---------");
        queue.printQueue();
    }
}
