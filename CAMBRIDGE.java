import java.io.*;
import java.util.*;

class Queue {
    int front, rear;
    int maxSize;
    int[] queueArray;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public boolean isFull() {
        return (rear == maxSize - 1);
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue element: " + data);
        } else {
            if (isEmpty()) {
                front = 0;
            }
            rear++;
            queueArray[rear] = data;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to display");
        } else {
            
            for (int i = front; i <= rear; i++) {
                System.out.print(queueArray[i] + " ");
            }
            System.out.println();
        }
    }
}

public class CAMBRIDGE{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        Queue queue = new Queue(size);

     
        for (int i = 0; i < size; i++) {
            int element = sc.nextInt();
            queue.enqueue(element);
        }

        queue.display();
        sc.close();
    }
}
