import java.util.ArrayList;
import java.util.Scanner;

public class Queue {
    private ArrayList<Integer> queue;
    private Scanner scanner;

    public Queue() {
        queue = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void enqueue(int value) {
        queue.add(value);
        System.out.println(value + " enqueued to queue");
    }

    public void dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            int value = queue.remove(0);
            System.out.println(value + " dequeued from queue");
        }
    }

    public void display() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements: " + queue);
        }
    }

    public void isEmpty() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is not empty");
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
        q.isEmpty();
    }
}